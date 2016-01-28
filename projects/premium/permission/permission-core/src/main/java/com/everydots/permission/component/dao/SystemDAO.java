/**
 * dao
 */
package com.everydots.permission.component.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.System;

public interface SystemDAO extends JpaRepository<System, String>, JpaSpecificationExecutor<System> {

}