/**
 * dao
 */
package com.everydots.permission.component.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.RolePermission;

public interface RolePermissionDAO extends JpaRepository<RolePermission, String>, JpaSpecificationExecutor<RolePermission> {
	List<RolePermission> findByRoleid(String roleid);
}