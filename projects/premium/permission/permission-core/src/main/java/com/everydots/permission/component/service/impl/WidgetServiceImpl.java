/**
 * WidgetServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.Widget;
import com.everydots.permission.component.dao.WidgetDAO;
import com.everydots.permission.component.service.WidgetService;

@Service
@Transactional
public class WidgetServiceImpl implements WidgetService {
	
	@Autowired
	private WidgetDAO widgetDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.WidgetService#get(java.lang.String)  
	 */ 
	@Override
	public Widget get(String id) {
		return widgetDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.WidgetService#saveOrUpdate(com.everydots.permission.component.entity.main.Widget)  
	 */
	@Override
	public void saveOrUpdate(Widget widget) {
		widgetDAO.save(widget);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.WidgetService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		widgetDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.WidgetService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<Widget> findAll(Page page) {
		org.springframework.data.domain.Page<Widget> springDataPage = widgetDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.WidgetService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<Widget> findByExample(
			Specification<Widget> specification, Page page) {
		org.springframework.data.domain.Page<Widget> springDataPage = widgetDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
