/**
 * RoleOrganizationService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.RoleOrganization;
import com.everydots.permission.common.util.util.dwz.Page;

public interface RoleOrganizationService {
	RoleOrganization get(String id);

	void saveOrUpdate(RoleOrganization roleOrganization);

	void delete(String id);
	
	List<RoleOrganization> findAll(Page page);
	
	List<RoleOrganization> findByExample(Specification<RoleOrganization> specification, Page page);
	
	List<RoleOrganization> findByOrganizationid(String organizationid);
}
