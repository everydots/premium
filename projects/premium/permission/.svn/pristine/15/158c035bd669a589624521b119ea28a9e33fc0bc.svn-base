/**
 * dao
 */
package com.everydots.permission.component.dao;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import com.everydots.permission.component.entity.main.Structure;

public interface StructureDAO extends JpaRepository<Structure, String>, JpaSpecificationExecutor<Structure> {
	
	Page<Structure> findByParentstructureid(String parentId, Pageable pageable);
	
	@QueryHints(value={
			@QueryHint(name="org.hibernate.cacheable",value="true"),
			@QueryHint(name="org.hibernate.cacheRegion",value="com.everydots.permission.component.entity.main.Structure")
		}
	)
	@Query("from Structure m order by m.priority ASC")
	List<Structure> findAllWithCach();
	
	Structure findByStructureid(String structureid);
}