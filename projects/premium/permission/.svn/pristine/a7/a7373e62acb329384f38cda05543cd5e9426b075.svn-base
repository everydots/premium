/**
 * UserDetailService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.UserDetail;
import com.everydots.permission.common.util.util.dwz.Page;

public interface UserDetailService {
	UserDetail get(String id);

	void saveOrUpdate(UserDetail userDetail);

	void delete(String id);
	
	List<UserDetail> findAll(Page page);
	
	List<UserDetail> findByExample(Specification<UserDetail> specification, Page page);
}
