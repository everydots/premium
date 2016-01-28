/**
 * CompanyServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.Company;
import com.everydots.permission.component.dao.CompanyDAO;
import com.everydots.permission.component.service.CompanyService;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyDAO companyDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyService#get(java.lang.String)  
	 */ 
	@Override
	public Company get(String id) {
		return companyDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.CompanyService#saveOrUpdate(com.everydots.permission.component.entity.main.Company)  
	 */
	@Override
	public void saveOrUpdate(Company company) {
		companyDAO.save(company);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		companyDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<Company> findAll(Page page) {
		org.springframework.data.domain.Page<Company> springDataPage = companyDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CompanyService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<Company> findByExample(
			Specification<Company> specification, Page page) {
		org.springframework.data.domain.Page<Company> springDataPage = companyDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
