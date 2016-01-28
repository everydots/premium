/**
 * RoleOrganizationServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.RoleOrganization;
import com.everydots.permission.component.dao.RoleOrganizationDAO;
import com.everydots.permission.component.service.RoleOrganizationService;

@Service
@Transactional
public class RoleOrganizationServiceImpl implements RoleOrganizationService {
	
	@Autowired
	private RoleOrganizationDAO roleOrganizationDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleOrganizationService#get(java.lang.String)  
	 */ 
	@Override
	public RoleOrganization get(String id) {
		return roleOrganizationDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.RoleOrganizationService#saveOrUpdate(com.everydots.permission.component.entity.main.RoleOrganization)  
	 */
	@Override
	public void saveOrUpdate(RoleOrganization roleOrganization) {
		roleOrganizationDAO.save(roleOrganization);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleOrganizationService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		roleOrganizationDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleOrganizationService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<RoleOrganization> findAll(Page page) {
		org.springframework.data.domain.Page<RoleOrganization> springDataPage = roleOrganizationDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleOrganizationService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<RoleOrganization> findByExample(
			Specification<RoleOrganization> specification, Page page) {
		org.springframework.data.domain.Page<RoleOrganization> springDataPage = roleOrganizationDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public List<RoleOrganization> findByOrganizationid(String organizationid) {
		return roleOrganizationDAO.findByOrganizationid(organizationid);
	}
}
