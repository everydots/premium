/**
 * DataControlService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.DataControl;
import com.everydots.permission.common.util.util.dwz.Page;

public interface DataControlService {
	DataControl get(String id);

	void saveOrUpdate(DataControl dataControl);

	void delete(String id);
	
	List<DataControl> findAll(Page page);
	
	List<DataControl> findByExample(Specification<DataControl> specification, Page page);

	DataControl findByDatacontrolid(String datacontrolid);
}
