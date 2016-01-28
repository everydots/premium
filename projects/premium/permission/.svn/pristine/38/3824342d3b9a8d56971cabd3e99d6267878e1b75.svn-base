/**
 * dao
 */
package com.everydots.permission.component.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.UserRole;

public interface UserRoleDAO extends JpaRepository<UserRole, String>, JpaSpecificationExecutor<UserRole> {
	List<UserRole> findByUserid(String userid);
}