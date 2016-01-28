/**
 * UserRoleService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.UserRole;
import com.everydots.permission.common.util.util.dwz.Page;

public interface UserRoleService {
	UserRole get(String id);

	void saveOrUpdate(UserRole userRole);

	void delete(String id);
	
	List<UserRole> findAll(Page page);
	
	List<UserRole> findByExample(Specification<UserRole> specification, Page page);
	
	List<UserRole> findByUserid(String userId);
}
