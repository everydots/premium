/**
 * UserService
 */
package com.everydots.permission.component.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.everydots.permission.component.entity.main.User;
import com.everydots.permission.common.exception.ServiceException;
import com.everydots.permission.common.util.util.dwz.Page;

public interface UserService {
	User get(String id);

	void saveOrUpdate(User user);

	void delete(String id);
	
	List<User> findAll(Page page);
	
	List<User> findByExample(Specification<User> specification, Page page);
	
	User getByUserloginname(String userloginname);

	void resetPwd(User user, String newPwd);

	void updatePwd(User user, String newPwd) throws ServiceException;
	
	User getByUserloginnameAndCompanyId(String loginname,String companyId);
}
