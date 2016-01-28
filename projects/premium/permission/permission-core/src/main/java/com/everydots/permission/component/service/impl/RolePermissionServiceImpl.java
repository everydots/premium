/**
 * RolePermissionServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.RolePermission;
import com.everydots.permission.component.dao.RolePermissionDAO;
import com.everydots.permission.component.service.RolePermissionService;

@Service
@Transactional
public class RolePermissionServiceImpl implements RolePermissionService {
	
	@Autowired
	private RolePermissionDAO rolePermissionDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionService#get(java.lang.String)  
	 */ 
	@Override
	public RolePermission get(String id) {
		return rolePermissionDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.RolePermissionService#saveOrUpdate(com.everydots.permission.component.entity.main.RolePermission)  
	 */
	@Override
	public void saveOrUpdate(RolePermission rolePermission) {
		rolePermissionDAO.save(rolePermission);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		rolePermissionDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<RolePermission> findAll(Page page) {
		org.springframework.data.domain.Page<RolePermission> springDataPage = rolePermissionDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<RolePermission> findByExample(
			Specification<RolePermission> specification, Page page) {
		org.springframework.data.domain.Page<RolePermission> springDataPage = rolePermissionDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public List<RolePermission> findByRoleid(String roleid) {
		return rolePermissionDAO.findByRoleid(roleid);
	}
}
