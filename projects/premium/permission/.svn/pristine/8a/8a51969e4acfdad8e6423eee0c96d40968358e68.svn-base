/**
 * UserRoleServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.UserRole;
import com.everydots.permission.component.dao.UserRoleDAO;
import com.everydots.permission.component.service.UserRoleService;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {
	
	@Autowired
	private UserRoleDAO userRoleDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserRoleService#get(java.lang.String)  
	 */ 
	@Override
	public UserRole get(String id) {
		return userRoleDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.UserRoleService#saveOrUpdate(com.everydots.permission.component.entity.main.UserRole)  
	 */
	@Override
	public void saveOrUpdate(UserRole userRole) {
		userRoleDAO.save(userRole);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserRoleService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		userRoleDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserRoleService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<UserRole> findAll(Page page) {
		org.springframework.data.domain.Page<UserRole> springDataPage = userRoleDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserRoleService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<UserRole> findByExample(
			Specification<UserRole> specification, Page page) {
		org.springframework.data.domain.Page<UserRole> springDataPage = userRoleDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public List<UserRole> findByUserid(String userId) {
		return userRoleDAO.findByUserid(userId);
	}
}
