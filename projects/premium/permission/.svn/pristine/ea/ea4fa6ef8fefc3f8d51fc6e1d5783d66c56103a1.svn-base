/**
 * OrganizationService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.Organization;
import com.everydots.permission.common.util.util.dwz.Page;

public interface OrganizationService {
	Organization get(String id);

	void saveOrUpdate(Organization organization);

	void delete(String id);
	
	List<Organization> findAll(Page page);
	
	List<Organization> findByExample(Specification<Organization> specification, Page page);
}
