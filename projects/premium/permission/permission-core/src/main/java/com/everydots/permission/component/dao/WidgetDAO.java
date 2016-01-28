/**
 * dao
 */
package com.everydots.permission.component.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.Widget;

public interface WidgetDAO extends JpaRepository<Widget, String>, JpaSpecificationExecutor<Widget> {

}