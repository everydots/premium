/**
 * dao
 */
package com.everydots.permission.component.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.Role;

public interface RoleDAO extends JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {
	Role findByRoleid(String roleId);
}