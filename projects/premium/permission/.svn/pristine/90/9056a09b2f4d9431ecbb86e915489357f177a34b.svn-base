/**
 * dao
 */
package com.everydots.permission.component.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.RoleOrganization;

public interface RoleOrganizationDAO extends JpaRepository<RoleOrganization, String>, JpaSpecificationExecutor<RoleOrganization> {
	List<RoleOrganization> findByOrganizationid(String organizationid);
}