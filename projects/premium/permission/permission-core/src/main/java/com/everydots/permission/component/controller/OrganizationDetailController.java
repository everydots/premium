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
import com.everydots.permission.component.entity.main.OrganizationDetail;
import com.everydots.permission.component.service.OrganizationDetailService;

@Controller
@RequestMapping("/management/OrganizationDetail/organizationDetail")
public class OrganizationDetailController {

	@Autowired
	private OrganizationDetailService organizationDetailService;
	
	private static final String CREATE = "management/OrganizationDetail/organizationDetail/create";
	private static final String UPDATE = "management/OrganizationDetail/organizationDetail/update";
	private static final String LIST = "management/OrganizationDetail/organizationDetail/list";
	private static final String VIEW = "management/OrganizationDetail/organizationDetail/view";
	
	@RequiresPermissions("OrganizationDetail:save")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String preCreate(Map<String, Object> map) {
		return CREATE;
	}
	
	@Log(message="添加了id={0}任务。")
	@RequiresPermissions("OrganizationDetail:save")
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody String create(@Valid OrganizationDetail organizationDetail) {
		organizationDetailService.saveOrUpdate(organizationDetail);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{organizationDetail.getId()}));
		return AjaxObject.newOk("任务添加成功！").toString();
	}
	
	@ModelAttribute("preloadOrganizationDetail")
	public OrganizationDetail preload(@RequestParam(value = "id", required = false) String id) {
		if (id != null) {
			OrganizationDetail organizationDetail = organizationDetailService.get(id);
			return organizationDetail;
		}
		return null;
	}
	
	@RequiresPermissions("OrganizationDetail:edit")
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String preUpdate(@PathVariable String id, Map<String, Object> map) {
		OrganizationDetail organizationDetail = organizationDetailService.get(id);
		map.put("organizationDetail", organizationDetail);
		return UPDATE;
	}
	
	@Log(message="修改了id={0}任务的信息。")
	@RequiresPermissions("OrganizationDetail:edit")
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody String update(@Valid @ModelAttribute("preloadOrganizationDetail")OrganizationDetail organizationDetail) {
		organizationDetailService.saveOrUpdate(organizationDetail);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{organizationDetail.getId()}));
		return AjaxObject.newOk("任务修改成功！").toString();
	}

	@Log(message="删除了id={0}任务。")
	@RequiresPermissions("OrganizationDetail:delete")
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public @ResponseBody String delete(@PathVariable String id) {
		organizationDetailService.delete(id);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{id}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}
	
	@Log(message="批量删除了id={0}任务。")
	@RequiresPermissions("OrganizationDetail:delete")
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody String deleteMany(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			OrganizationDetail organizationDetail = organizationDetailService.get(ids[i]);
			organizationDetailService.delete(organizationDetail.getId());
		}
		
		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{Arrays.toString(ids)}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}

	@RequiresPermissions("OrganizationDetail:view")
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(ServletRequest request, Page page, Map<String, Object> map) {
		Specification<OrganizationDetail> specification = DynamicSpecifications.bySearchFilter(request, OrganizationDetail.class);
		List<OrganizationDetail> organizationDetails = organizationDetailService.findByExample(specification, page);
		
		map.put("page", page);
		map.put("organizationDetails", organizationDetails);

		return LIST;
	}
	
	@RequiresPermissions("OrganizationDetail:view")
	@RequestMapping(value="/view/{id}", method={RequestMethod.GET})
	public String view(@PathVariable String id, Map<String, Object> map) {
		OrganizationDetail organizationDetail = organizationDetailService.get(id);
		map.put("organizationDetail", organizationDetail);
		return VIEW;
	}
}
