/**
 * CompanyDetailService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.CompanyDetail;
import com.everydots.permission.common.util.util.dwz.Page;

public interface CompanyDetailService {
	CompanyDetail get(String id);

	void saveOrUpdate(CompanyDetail companyDetail);

	void delete(String id);
	
	List<CompanyDetail> findAll(Page page);
	
	List<CompanyDetail> findByExample(Specification<CompanyDetail> specification, Page page);
}
