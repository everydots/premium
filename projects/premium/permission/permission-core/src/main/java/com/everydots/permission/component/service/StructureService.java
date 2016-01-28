/**
 * StructureService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.Structure;
import com.everydots.permission.common.util.util.dwz.Page;

public interface StructureService {
	Structure get(String id);

	void saveOrUpdate(Structure structure);

	void delete(String id);
	
	List<Structure> findAll(Page page);
	
	List<Structure> findByExample(Specification<Structure> specification, Page page);
	
	Structure getTree();
	
	Structure findByStructureid(String structureid);
}
