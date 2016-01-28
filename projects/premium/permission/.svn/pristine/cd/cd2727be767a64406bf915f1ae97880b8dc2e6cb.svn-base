/**
 * RolePermissionDataControlService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.RolePermissionDataControl;
import com.everydots.permission.common.util.util.dwz.Page;

public interface RolePermissionDataControlService {
	RolePermissionDataControl get(String id);

	void saveOrUpdate(RolePermissionDataControl rolePermissionDataControl);

	void delete(String id);
	
	List<RolePermissionDataControl> findAll(Page page);
	
	List<RolePermissionDataControl> findByExample(Specification<RolePermissionDataControl> specification, Page page);

	List<RolePermissionDataControl> findByRolePermissionId(String rolepermissionid);
}
