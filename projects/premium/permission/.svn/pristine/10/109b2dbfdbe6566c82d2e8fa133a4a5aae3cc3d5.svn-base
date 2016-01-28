/**
 * CompanyDetailServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.CompanyDetail;
import com.everydots.permission.component.dao.CompanyDetailDAO;
import com.everydots.permission.component.service.CompanyDetailService;

@Service
@Transactional
public class CompanyDetailServiceImpl implements CompanyDetailService {
	
	@Autowired
	private CompanyDetailDAO companyDetailDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyDetailService#get(java.lang.String)  
	 */ 
	@Override
	public CompanyDetail get(String id) {
		return companyDetailDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.CompanyDetailService#saveOrUpdate(com.everydots.permission.component.entity.main.CompanyDetail)  
	 */
	@Override
	public void saveOrUpdate(CompanyDetail companyDetail) {
		companyDetailDAO.save(companyDetail);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyDetailService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		companyDetailDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyDetailService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<CompanyDetail> findAll(Page page) {
		org.springframework.data.domain.Page<CompanyDetail> springDataPage = companyDetailDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyDetailService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<CompanyDetail> findByExample(
			Specification<CompanyDetail> specification, Page page) {
		org.springframework.data.domain.Page<CompanyDetail> springDataPage = companyDetailDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
