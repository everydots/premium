/**
 * RolePermissionDataControlServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.RolePermissionDataControl;
import com.everydots.permission.component.dao.RolePermissionDataControlDAO;
import com.everydots.permission.component.service.RolePermissionDataControlService;

@Service
@Transactional
public class RolePermissionDataControlServiceImpl implements RolePermissionDataControlService {
	
	@Autowired
	private RolePermissionDataControlDAO rolePermissionDataControlDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionDataControlService#get(java.lang.String)  
	 */ 
	@Override
	public RolePermissionDataControl get(String id) {
		return rolePermissionDataControlDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.RolePermissionDataControlService#saveOrUpdate(com.everydots.permission.component.entity.main.RolePermissionDataControl)  
	 */
	@Override
	public void saveOrUpdate(RolePermissionDataControl rolePermissionDataControl) {
		rolePermissionDataControlDAO.save(rolePermissionDataControl);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionDataControlService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		rolePermissionDataControlDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionDataControlService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<RolePermissionDataControl> findAll(Page page) {
		org.springframework.data.domain.Page<RolePermissionDataControl> springDataPage = rolePermissionDataControlDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.RolePermissionDataControlService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<RolePermissionDataControl> findByExample(
			Specification<RolePermissionDataControl> specification, Page page) {
		org.springframework.data.domain.Page<RolePermissionDataControl> springDataPage = rolePermissionDataControlDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public List<RolePermissionDataControl> findByRolePermissionId(String rolepermissionid) {
		// TODO Auto-generated method stub
		return rolePermissionDataControlDAO.findByRolepermissionid(rolepermissionid);
	}
}
