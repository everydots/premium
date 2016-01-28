/**
 * OrganizationDetailService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.OrganizationDetail;
import com.everydots.permission.common.util.util.dwz.Page;

public interface OrganizationDetailService {
	OrganizationDetail get(String id);

	void saveOrUpdate(OrganizationDetail organizationDetail);

	void delete(String id);
	
	List<OrganizationDetail> findAll(Page page);
	
	List<OrganizationDetail> findByExample(Specification<OrganizationDetail> specification, Page page);
}
