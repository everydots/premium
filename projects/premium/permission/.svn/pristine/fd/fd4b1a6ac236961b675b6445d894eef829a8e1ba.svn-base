/**
 * UserDetailServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.UserDetail;
import com.everydots.permission.component.dao.UserDetailDAO;
import com.everydots.permission.component.service.UserDetailService;

@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailService {
	
	@Autowired
	private UserDetailDAO userDetailDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserDetailService#get(java.lang.String)  
	 */ 
	@Override
	public UserDetail get(String id) {
		return userDetailDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.UserDetailService#saveOrUpdate(com.everydots.permission.component.entity.main.UserDetail)  
	 */
	@Override
	public void saveOrUpdate(UserDetail userDetail) {
		userDetailDAO.save(userDetail);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserDetailService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		userDetailDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserDetailService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<UserDetail> findAll(Page page) {
		org.springframework.data.domain.Page<UserDetail> springDataPage = userDetailDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.UserDetailService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<UserDetail> findByExample(
			Specification<UserDetail> specification, Page page) {
		org.springframework.data.domain.Page<UserDetail> springDataPage = userDetailDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
