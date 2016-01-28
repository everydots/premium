/**
 * SystemServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.System;
import com.everydots.permission.component.dao.SystemDAO;
import com.everydots.permission.component.service.SystemService;

@Service
@Transactional
public class SystemServiceImpl implements SystemService {
	
	@Autowired
	private SystemDAO systemDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.SystemService#get(java.lang.String)  
	 */ 
	@Override
	public System get(String id) {
		return systemDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.SystemService#saveOrUpdate(com.everydots.permission.component.entity.main.System)  
	 */
	@Override
	public void saveOrUpdate(System system) {
		systemDAO.save(system);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.SystemService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		systemDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.SystemService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<System> findAll(Page page) {
		org.springframework.data.domain.Page<System> springDataPage = systemDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.SystemService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<System> findByExample(
			Specification<System> specification, Page page) {
		org.springframework.data.domain.Page<System> springDataPage = systemDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
