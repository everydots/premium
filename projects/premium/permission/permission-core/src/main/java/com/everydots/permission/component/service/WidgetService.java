/**
 * WidgetService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.Widget;
import com.everydots.permission.common.util.util.dwz.Page;

public interface WidgetService {
	Widget get(String id);

	void saveOrUpdate(Widget widget);

	void delete(String id);
	
	List<Widget> findAll(Page page);
	
	List<Widget> findByExample(Specification<Widget> specification, Page page);
}
