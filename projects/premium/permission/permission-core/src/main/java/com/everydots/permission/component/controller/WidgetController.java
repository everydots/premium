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
import com.everydots.permission.component.entity.main.Widget;
import com.everydots.permission.component.service.WidgetService;

@Controller
@RequestMapping("/management/Widget/widget")
public class WidgetController {

	@Autowired
	private WidgetService widgetService;
	
	private static final String CREATE = "management/Widget/widget/create";
	private static final String UPDATE = "management/Widget/widget/update";
	private static final String LIST = "management/Widget/widget/list";
	private static final String VIEW = "management/Widget/widget/view";
	
	@RequiresPermissions("Widget:save")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String preCreate(Map<String, Object> map) {
		return CREATE;
	}
	
	@Log(message="添加了id={0}任务。")
	@RequiresPermissions("Widget:save")
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody String create(@Valid Widget widget) {
		widgetService.saveOrUpdate(widget);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{widget.getId()}));
		return AjaxObject.newOk("任务添加成功！").toString();
	}
	
	@ModelAttribute("preloadWidget")
	public Widget preload(@RequestParam(value = "id", required = false) String id) {
		if (id != null) {
			Widget widget = widgetService.get(id);
			return widget;
		}
		return null;
	}
	
	@RequiresPermissions("Widget:edit")
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String preUpdate(@PathVariable String id, Map<String, Object> map) {
		Widget widget = widgetService.get(id);
		map.put("widget", widget);
		return UPDATE;
	}
	
	@Log(message="修改了id={0}任务的信息。")
	@RequiresPermissions("Widget:edit")
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody String update(@Valid @ModelAttribute("preloadWidget")Widget widget) {
		widgetService.saveOrUpdate(widget);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{widget.getId()}));
		return AjaxObject.newOk("任务修改成功！").toString();
	}

	@Log(message="删除了id={0}任务。")
	@RequiresPermissions("Widget:delete")
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public @ResponseBody String delete(@PathVariable String id) {
		widgetService.delete(id);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{id}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}
	
	@Log(message="批量删除了id={0}任务。")
	@RequiresPermissions("Widget:delete")
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody String deleteMany(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			Widget widget = widgetService.get(ids[i]);
			widgetService.delete(widget.getId());
		}
		
		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{Arrays.toString(ids)}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}

	@RequiresPermissions("Widget:view")
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(ServletRequest request, Page page, Map<String, Object> map) {
		Specification<Widget> specification = DynamicSpecifications.bySearchFilter(request, Widget.class);
		List<Widget> widgets = widgetService.findByExample(specification, page);
		
		map.put("page", page);
		map.put("widgets", widgets);

		return LIST;
	}
	
	@RequiresPermissions("Widget:view")
	@RequestMapping(value="/view/{id}", method={RequestMethod.GET})
	public String view(@PathVariable String id, Map<String, Object> map) {
		Widget widget = widgetService.get(id);
		map.put("widget", widget);
		return VIEW;
	}
}
