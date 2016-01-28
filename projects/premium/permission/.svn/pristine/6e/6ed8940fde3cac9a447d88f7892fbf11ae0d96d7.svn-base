/**
 * PermissionServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.Permission;
import com.everydots.permission.component.dao.PermissionDAO;
import com.everydots.permission.component.service.PermissionService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	private PermissionDAO permissionDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.PermissionService#get(java.lang.String)  
	 */ 
	@Override
	public Permission get(String id) {
		return permissionDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.PermissionService#saveOrUpdate(com.everydots.permission.component.entity.main.Permission)  
	 */
	@Override
	public void saveOrUpdate(Permission permission) {
		permissionDAO.save(permission);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.PermissionService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		permissionDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.PermissionService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<Permission> findAll(Page page) {
		org.springframework.data.domain.Page<Permission> springDataPage = permissionDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.PermissionService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<Permission> findByExample(
			Specification<Permission> specification, Page page) {
		org.springframework.data.domain.Page<Permission> springDataPage = permissionDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public Permission findByPermissionid(String permissionid) {
		return permissionDAO.findBypermissionid(permissionid);
	}
}
