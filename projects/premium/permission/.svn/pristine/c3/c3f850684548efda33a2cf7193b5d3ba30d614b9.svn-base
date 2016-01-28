/**
 * PermissionService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.Permission;
import com.everydots.permission.common.util.util.dwz.Page;

public interface PermissionService {
	Permission get(String id);

	void saveOrUpdate(Permission permission);

	void delete(String id);
	
	List<Permission> findAll(Page page);
	
	List<Permission> findByExample(Specification<Permission> specification, Page page);
	
	Permission findByPermissionid(String permissionid);
}
