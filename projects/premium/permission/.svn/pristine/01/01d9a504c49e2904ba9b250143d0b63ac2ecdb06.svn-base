/**
 * CodeLibraryService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.CodeLibrary;
import com.everydots.permission.common.util.util.dwz.Page;

public interface CodeLibraryService {
	CodeLibrary get(String id);

	void saveOrUpdate(CodeLibrary codeLibrary);

	void delete(String id);
	
	List<CodeLibrary> findAll(Page page);
	
	List<CodeLibrary> findByExample(Specification<CodeLibrary> specification, Page page);
}
