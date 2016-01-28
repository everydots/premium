/**
 * CompanyService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.Company;
import com.everydots.permission.common.util.util.dwz.Page;

public interface CompanyService {
	Company get(String id);

	void saveOrUpdate(Company company);

	void delete(String id);
	
	List<Company> findAll(Page page);
	
	List<Company> findByExample(Specification<Company> specification, Page page);
}
