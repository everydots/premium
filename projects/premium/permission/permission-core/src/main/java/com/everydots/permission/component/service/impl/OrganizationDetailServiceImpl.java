/**
 * OrganizationDetailServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.OrganizationDetail;
import com.everydots.permission.component.dao.OrganizationDetailDAO;
import com.everydots.permission.component.service.OrganizationDetailService;

@Service
@Transactional
public class OrganizationDetailServiceImpl implements OrganizationDetailService {
	
	@Autowired
	private OrganizationDetailDAO organizationDetailDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationDetailService#get(java.lang.String)  
	 */ 
	@Override
	public OrganizationDetail get(String id) {
		return organizationDetailDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.OrganizationDetailService#saveOrUpdate(com.everydots.permission.component.entity.main.OrganizationDetail)  
	 */
	@Override
	public void saveOrUpdate(OrganizationDetail organizationDetail) {
		organizationDetailDAO.save(organizationDetail);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationDetailService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		organizationDetailDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationDetailService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<OrganizationDetail> findAll(Page page) {
		org.springframework.data.domain.Page<OrganizationDetail> springDataPage = organizationDetailDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.OrganizationDetailService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<OrganizationDetail> findByExample(
			Specification<OrganizationDetail> specification, Page page) {
		org.springframework.data.domain.Page<OrganizationDetail> springDataPage = organizationDetailDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
