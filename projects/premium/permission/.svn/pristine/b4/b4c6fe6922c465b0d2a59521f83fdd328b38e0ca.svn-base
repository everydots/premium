/**
 * dao
 */
package com.everydots.permission.component.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.RolePermissionDataControl;

public interface RolePermissionDataControlDAO extends JpaRepository<RolePermissionDataControl, String>, JpaSpecificationExecutor<RolePermissionDataControl> {

	List<RolePermissionDataControl> findByRolepermissionid(String rolepermissionid);

}