/**
 * OrganizationServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.Organization;
import com.everydots.permission.component.dao.OrganizationDAO;
import com.everydots.permission.component.service.OrganizationService;

@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService {
	
	@Autowired
	private OrganizationDAO organizationDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationService#get(java.lang.String)  
	 */ 
	@Override
	public Organization get(String id) {
		return organizationDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.OrganizationService#saveOrUpdate(com.everydots.permission.component.entity.main.Organization)  
	 */
	@Override
	public void saveOrUpdate(Organization organization) {
		organizationDAO.save(organization);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		organizationDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<Organization> findAll(Page page) {
		org.springframework.data.domain.Page<Organization> springDataPage = organizationDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<Organization> findByExample(
			Specification<Organization> specification, Page page) {
		org.springframework.data.domain.Page<Organization> springDataPage = organizationDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
