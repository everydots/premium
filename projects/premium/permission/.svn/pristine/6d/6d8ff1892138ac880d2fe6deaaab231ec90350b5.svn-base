/**
 * 
 */
package com.everydots.permission.component.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import javax.validation.Valid;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.everydots.permission.common.util.util.dwz.AjaxObject;
import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.persistence.DynamicSpecifications;
import com.everydots.permission.common.log.Log;
import com.everydots.permission.common.log.LogMessageObject;
import com.everydots.permission.common.log.impl.LogUitls;
import com.everydots.permission.component.entity.main.UserDetail;
import com.everydots.permission.component.service.UserDetailService;

@Controller
@RequestMapping("/management/UserDetail/userDetail")
public class UserDetailController {

	@Autowired
	private UserDetailService userDetailService;
	
	private static final String CREATE = "management/UserDetail/userDetail/create";
	private static final String UPDATE = "management/UserDetail/userDetail/update";
	private static final String LIST = "management/UserDetail/userDetail/list";
	private static final String VIEW = "management/UserDetail/userDetail/view";
	
	@RequiresPermissions("UserDetail:save")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String preCreate(Map<String, Object> map) {
		return CREATE;
	}
	
	@Log(message="添加了id={0}任务。")
	@RequiresPermissions("UserDetail:save")
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody String create(@Valid UserDetail userDetail) {
		userDetailService.saveOrUpdate(userDetail);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{userDetail.getId()}));
		return AjaxObject.newOk("任务添加成功！").toString();
	}
	
	@ModelAttribute("preloadUserDetail")
	public UserDetail preload(@RequestParam(value = "id", required = false) String id) {
		if (id != null) {
			UserDetail userDetail = userDetailService.get(id);
			return userDetail;
		}
		return null;
	}
	
	@RequiresPermissions("UserDetail:edit")
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String preUpdate(@PathVariable String id, Map<String, Object> map) {
		UserDetail userDetail = userDetailService.get(id);
		map.put("userDetail", userDetail);
		return UPDATE;
	}
	
	@Log(message="修改了id={0}任务的信息。")
	@RequiresPermissions("UserDetail:edit")
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody String update(@Valid @ModelAttribute("preloadUserDetail")UserDetail userDetail) {
		userDetailService.saveOrUpdate(userDetail);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{userDetail.getId()}));
		return AjaxObject.newOk("任务修改成功！").toString();
	}

	@Log(message="删除了id={0}任务。")
	@RequiresPermissions("UserDetail:delete")
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public @ResponseBody String delete(@PathVariable String id) {
		userDetailService.delete(id);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{id}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}
	
	@Log(message="批量删除了id={0}任务。")
	@RequiresPermissions("UserDetail:delete")
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody String deleteMany(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			UserDetail userDetail = userDetailService.get(ids[i]);
			userDetailService.delete(userDetail.getId());
		}
		
		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{Arrays.toString(ids)}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}

	@RequiresPermissions("UserDetail:view")
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(ServletRequest request, Page page, Map<String, Object> map) {
		Specification<UserDetail> specification = DynamicSpecifications.bySearchFilter(request, UserDetail.class);
		List<UserDetail> userDetails = userDetailService.findByExample(specification, page);
		
		map.put("page", page);
		map.put("userDetails", userDetails);

		return LIST;
	}
	
	@RequiresPermissions("UserDetail:view")
	@RequestMapping(value="/view/{id}", method={RequestMethod.GET})
	public String view(@PathVariable String id, Map<String, Object> map) {
		UserDetail userDetail = userDetailService.get(id);
		map.put("userDetail", userDetail);
		return VIEW;
	}
}
