/**
 * dao
 */
package com.everydots.permission.component.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.Permission;

public interface PermissionDAO extends JpaRepository<Permission, String>, JpaSpecificationExecutor<Permission> {
	Permission findBypermissionid(String permissionid);
}