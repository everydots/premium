/**
 * dao
 */
package com.everydots.permission.component.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.DataControl;

public interface DataControlDAO extends JpaRepository<DataControl, String>, JpaSpecificationExecutor<DataControl> {

	DataControl findByDatacontrolid(String datacontrolid);

}