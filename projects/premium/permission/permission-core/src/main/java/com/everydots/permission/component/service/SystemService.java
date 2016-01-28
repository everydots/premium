/**
 * SystemService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.System;
import com.everydots.permission.common.util.util.dwz.Page;

public interface SystemService {
	System get(String id);

	void saveOrUpdate(System system);

	void delete(String id);
	
	List<System> findAll(Page page);
	
	List<System> findByExample(Specification<System> specification, Page page);
}
