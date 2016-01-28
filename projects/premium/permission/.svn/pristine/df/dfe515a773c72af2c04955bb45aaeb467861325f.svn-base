/**
 * LogInfoService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.LogInfo;
import com.everydots.permission.common.util.util.dwz.Page;

public interface LogInfoService {
	LogInfo get(String id);

	void saveOrUpdate(LogInfo logInfo);

	void delete(String id);
	
	List<LogInfo> findAll(Page page);
	
	List<LogInfo> findByExample(Specification<LogInfo> specification, Page page);
}
