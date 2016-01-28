/**
 * RolePermissionService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.RolePermission;
import com.everydots.permission.common.util.util.dwz.Page;

public interface RolePermissionService {
	RolePermission get(String id);

	void saveOrUpdate(RolePermission rolePermission);

	void delete(String id);
	
	List<RolePermission> findAll(Page page);
	
	List<RolePermission> findByExample(Specification<RolePermission> specification, Page page);
	
	List<RolePermission> findByRoleid(String roleid);
}
