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
import com.everydots.permission.component.entity.main.CompanyDetail;
import com.everydots.permission.component.service.CompanyDetailService;

@Controller
@RequestMapping("/management/CompanyDetail/companyDetail")
public class CompanyDetailController {

	@Autowired
	private CompanyDetailService companyDetailService;
	
	private static final String CREATE = "management/CompanyDetail/companyDetail/create";
	private static final String UPDATE = "management/CompanyDetail/companyDetail/update";
	private static final String LIST = "management/CompanyDetail/companyDetail/list";
	private static final String VIEW = "management/CompanyDetail/companyDetail/view";
	
	@InitBinder
	public void dataBinder(WebDataBinder dataBinder) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		dataBinder.registerCustomEditor(Date.class, 
				new CustomDateEditor(df, true));
	}
	
	@RequiresPermissions("CompanyDetail:save")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String preCreate(Map<String, Object> map) {
		return CREATE;
	}
	
	@Log(message="添加了id={0}任务。")
	@RequiresPermissions("CompanyDetail:save")
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody String create(@Valid CompanyDetail companyDetail) {
		companyDetailService.saveOrUpdate(companyDetail);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{companyDetail.getId()}));
		return AjaxObject.newOk("任务添加成功！").toString();
	}
	
	@ModelAttribute("preloadCompanyDetail")
	public CompanyDetail preload(@RequestParam(value = "id", required = false) String id) {
		if (id != null) {
			CompanyDetail companyDetail = companyDetailService.get(id);
			return companyDetail;
		}
		return null;
	}
	
	@RequiresPermissions("CompanyDetail:edit")
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String preUpdate(@PathVariable String id, Map<String, Object> map) {
		CompanyDetail companyDetail = companyDetailService.get(id);
		map.put("companyDetail", companyDetail);
		return UPDATE;
	}
	
	@Log(message="修改了id={0}任务的信息。")
	@RequiresPermissions("CompanyDetail:edit")
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody String update(@Valid @ModelAttribute("preloadCompanyDetail")CompanyDetail companyDetail) {
		companyDetailService.saveOrUpdate(companyDetail);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{companyDetail.getId()}));
		return AjaxObject.newOk("任务修改成功！").toString();
	}

	@Log(message="删除了id={0}任务。")
	@RequiresPermissions("CompanyDetail:delete")
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public @ResponseBody String delete(@PathVariable String id) {
		companyDetailService.delete(id);

		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{id}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}
	
	@Log(message="批量删除了id={0}任务。")
	@RequiresPermissions("CompanyDetail:delete")
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody String deleteMany(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			CompanyDetail companyDetail = companyDetailService.get(ids[i]);
			companyDetailService.delete(companyDetail.getId());
		}
		
		LogUitls.putArgs(LogMessageObject.newWrite().setObjects(new Object[]{Arrays.toString(ids)}));
		return AjaxObject.newOk("任务删除成功！").setCallbackType("").toString();
	}

	@RequiresPermissions("CompanyDetail:view")
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(ServletRequest request, Page page, Map<String, Object> map) {
		Specification<CompanyDetail> specification = DynamicSpecifications.bySearchFilter(request, CompanyDetail.class);
		List<CompanyDetail> companyDetails = companyDetailService.findByExample(specification, page);
		
		map.put("page", page);
		map.put("companyDetails", companyDetails);

		return LIST;
	}
	
	@RequiresPermissions("CompanyDetail:view")
	@RequestMapping(value="/view/{id}", method={RequestMethod.GET})
	public String view(@PathVariable String id, Map<String, Object> map) {
		CompanyDetail companyDetail = companyDetailService.get(id);
		map.put("companyDetail", companyDetail);
		return VIEW;
	}
}
