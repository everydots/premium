/**
 * RoleService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.Role;
import com.everydots.permission.common.util.util.dwz.Page;

public interface RoleService {
	Role get(String id);

	void saveOrUpdate(Role role);

	void delete(String id);
	
	List<Role> findAll(Page page);
	
	List<Role> findByExample(Specification<Role> specification, Page page);
	
	Role findByRoleid(String roleId);
}
