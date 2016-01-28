/**
 * 
 */
package com.everydots.permission.component.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletRequest;

import javax.validation.Valid;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
import com.everydots.permission.component.entity.main.LogInfo;
import com.everydots.permission.component.service.LogInfoService;

@Controller
@RequestMapping("/management/LogInfo/logInfo")
public class LogInfoController {

	@Autowired
	private LogInfoService logInfoService;
	
	private static final String CREATE = "management/LogInfo/logInfo/create";
	private static final String UPDATE = "management/LogInfo/logInfo/update";
	private static final String LIST = "management/LogInfo/logInfo/list";
	private static final String VIEW = "management/LogInfo/logInfo/view";
	
	@InitBinder
	public void dataBinder(WebDataBinder dataBinder) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		dataBinder.registerCustomEditor(Date.class, 
				new CustomDateEditor(df, true));
	}
	
	@RequiresPermissions("LogInfo:save")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String preCreate(Map<String, Object> map) {
		return CREATE;
	}
	
	@Log(message="添加了id={0}任务。")
	@RequiresPermissions("LogInfo:save")
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody String create(@Valid LogInfo logInfo) {
		logInfoService.saveOrUpdate(logInfo);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{logInfo.getId()}));
		return AjaxObject.newOk("任务添加成功！").toString();
	}
	
	@ModelAttribute("preloadLogInfo")
	public LogInfo preload(@RequestParam(value = "id", required = false) String id) {
		if (id != null) {
			LogInfo logInfo = logInfoService.get(id);
			return logInfo;
		}
		return null;
	}
	
	@RequiresPermissions("LogInfo:edit")
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String preUpdate(@PathVariable String id, Map<String, Object> map) {
		LogInfo logInfo = logInfoService.get(id);
		map.put("logInfo", logInfo);
		return UPDATE;
	}
	
	@Log(message="修改了id={0}任务的信息。")
	@RequiresPermissions("LogInfo:edit")
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody String update(@Valid @ModelAttribute("preloadLogInfo")LogInfo logInfo) {
		logInfoService.saveOrUpdate(logInfo);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{logInfo.getId()}));
		return AjaxObject.newOk("任务修改成功！").toString();
	}

	@Log(message="删除了id={0}任务。")
	@RequiresPermissions("LogInfo:delete")
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public @ResponseBody String delete(@PathVariable String id) {
		logInfoService.delete(id);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{id}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}
	
	@Log(message="批量删除了id={0}任务。")
	@RequiresPermissions("LogInfo:delete")
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody String deleteMany(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			LogInfo logInfo = logInfoService.get(ids[i]);
			logInfoService.delete(logInfo.getId());
		}
		
		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{Arrays.toString(ids)}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}

	@RequiresPermissions("LogInfo:view")
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(ServletRequest request, Page page, Map<String, Object> map) {
		Specification<LogInfo> specification = DynamicSpecifications.bySearchFilter(request, LogInfo.class);
		List<LogInfo> logInfos = logInfoService.findByExample(specification, page);
		
		map.put("page", page);
		map.put("logInfos", logInfos);

		return LIST;
	}
	
	@RequiresPermissions("LogInfo:view")
	@RequestMapping(value="/view/{id}", method={RequestMethod.GET})
	public String view(@PathVariable String id, Map<String, Object> map) {
		LogInfo logInfo = logInfoService.get(id);
		map.put("logInfo", logInfo);
		return VIEW;
	}
}
