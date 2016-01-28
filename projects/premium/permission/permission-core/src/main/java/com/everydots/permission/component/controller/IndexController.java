package com.everydots.permission.component.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.everydots.permission.common.constants.CommonConstants;
import com.everydots.permission.common.constants.SecurityConstants;
import com.everydots.permission.common.exception.ServiceException;
import com.everydots.permission.common.log.Log;
import com.everydots.permission.common.log.LogMessageObject;
import com.everydots.permission.common.log.impl.LogUitls;
import com.everydots.permission.common.shiro.ShiroUser;
import com.everydots.permission.common.util.SecurityUtils;
import com.everydots.permission.common.util.util.dwz.AjaxObject;
import com.everydots.permission.component.entity.main.Structure;
import com.everydots.permission.component.entity.main.User;
import com.everydots.permission.component.service.StructureService;
import com.everydots.permission.component.service.UserService;


/** 
 * 	
 * @author 	<a href="mailto:ketayao@gmail.com">ketayao</a>
 * Version  1.1.0
 * @since   2012-8-2 下午5:45:57 
 */
@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private StructureService structureService;
	
	
	private static final String INDEX = "account/index";
	private static final String UPDATE_PASSWORD = "management/index/updatePwd";
	private static final String UPDATE_BASE = "management/index/updateBase";
	
	@Log(message="{0}登录了系统。")
	@RequiresUser 
	@RequestMapping(value="", method=RequestMethod.GET)
	public String index(ServletRequest request, Map<String, Object> map) {
		ShiroUser shiroUser = SecurityUtils.getShiroUser();
		
		Structure menuStructure = getMenuStructure(SecurityUtils.getSubject());

		map.put(SecurityConstants.LOGIN_USER, shiroUser.getUser());
		map.put("menuStructure", menuStructure);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{shiroUser.getLoginName()}));
		return INDEX;
	}
	
	private Structure getMenuStructure(Subject subject) {
		Structure rootStructure = structureService.getTree();

		check(rootStructure, subject);
		return rootStructure;
	}
	
	private void check(Structure structure, Subject subject) {
		List<Structure> list1 = new ArrayList<Structure>();
		for (Structure s1 : structure.getChildren()) {
			// 只加入拥有show权限的Module
			if (subject.isPermitted(s1.getSn() + ":" + CommonConstants.PERMISSION_SHOW)) {
				check(s1, subject);
				list1.add(s1);
			}
		}
		structure.setChildren(list1);
	}
	
	@RequiresUser
	@RequestMapping(value="/updatePwd", method=RequestMethod.GET)
	public String preUpdatePassword() {
		return UPDATE_PASSWORD;
	}
	
	@Log(message="{0}修改了密码。")
	@RequiresUser
	@RequestMapping(value="/updatePwd", method=RequestMethod.POST)
	public @ResponseBody String updatePassword(ServletRequest request, String plainPassword, 
			String newPassword, String rPassword) {
		User user = SecurityUtils.getLoginUser();
		
		if (newPassword != null && newPassword.equals(rPassword)) {
			user.setPlainPassword(plainPassword);
			try {
				userService.updatePwd(user, newPassword);
			} catch (ServiceException e) {
				LogUitls.putArgs(LogMessageObject.newIgnore());//忽略日志
				return AjaxObject.newError(e.getMessage()).setCallbackType("").toString();
			}
			LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{user.getUserloginname()}));
			return AjaxObject.newOk("修改密码成功！").toString();
		}
		
		return AjaxObject.newError("修改密码失败！").setCallbackType("").toString();
	}
	
	@RequiresUser
	@RequestMapping(value="/updateBase", method=RequestMethod.GET)
	public String preUpdateBase(Map<String, Object> map) {
		map.put(SecurityConstants.LOGIN_USER, SecurityUtils.getLoginUser());
		return UPDATE_BASE;
	}
	
	@Log(message="{0}修改了详细信息。")
	@RequiresUser
	@RequestMapping(value="/updateBase", method=RequestMethod.POST)
	public @ResponseBody String updateBase(User user, ServletRequest request) {
		User loginUser = SecurityUtils.getLoginUser();
		
		

		userService.saveOrUpdate(loginUser);
		
		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{user.getUserloginname()}));
		return AjaxObject.newOk("修改详细信息成功！").toString();
	}
}
