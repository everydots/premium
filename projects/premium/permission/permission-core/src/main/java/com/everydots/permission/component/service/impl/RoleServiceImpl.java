/**
 * RoleServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.Role;
import com.everydots.permission.component.dao.RoleDAO;
import com.everydots.permission.component.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDAO roleDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleService#get(java.lang.String)  
	 */ 
	@Override
	public Role get(String id) {
		return roleDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.RoleService#saveOrUpdate(com.everydots.permission.component.entity.main.Role)  
	 */
	@Override
	public void saveOrUpdate(Role role) {
		roleDAO.save(role);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		roleDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<Role> findAll(Page page) {
		org.springframework.data.domain.Page<Role> springDataPage = roleDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RoleService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<Role> findByExample(
			Specification<Role> specification, Page page) {
		org.springframework.data.domain.Page<Role> springDataPage = roleDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public Role findByRoleid(String roleId) {
		return roleDAO.findByRoleid(roleId);
	}
}
