/**
 * UserServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.exception.ExistedException;
import com.everydots.permission.common.exception.IncorrectPasswordException;
import com.everydots.permission.common.exception.NotDeletedException;
import com.everydots.permission.common.exception.ServiceException;
import com.everydots.permission.common.shiro.ShiroDbRealm;
import com.everydots.permission.common.shiro.ShiroDbRealm.HashPassword;
import com.everydots.permission.common.util.SecurityUtils;
import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.dao.UserDAO;
import com.everydots.permission.component.entity.main.User;
import com.everydots.permission.component.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ShiroDbRealm shiroRealm;

	/*
	 */ 
	@Override
	public User get(String id) {
		return userDAO.findOne(id);
	}

	/*
	 */
	@Override
	public void saveOrUpdate(User user) {
		if (user.getId() == null) {
			if (userDAO.findByUserloginname(user.getUserloginname()) != null) {
				throw new ExistedException("登录名：" + user.getUserloginname() + "已存在。");
			}
			
			//设定安全的密码，使用passwordService提供的salt并经过1024次 sha-1 hash
			if (StringUtils.isNotBlank(user.getPlainPassword()) && shiroRealm != null) {
				HashPassword hashPassword = ShiroDbRealm.encryptPassword(user.getPlainPassword());
				user.setSalt(hashPassword.salt);
				user.setPassword(hashPassword.password);
			}
		}
		
		userDAO.save(user);
		shiroRealm.clearCachedAuthorizationInfo(user.getUserloginname());
	}

	/*
	 */
	@Override
	public void delete(String id) {
		if (isSupervisor(id)) {
			logger.warn("操作员{}，尝试删除超级管理员用户", SecurityUtils.getSubject()
					.getPrincipal() + "。");
			throw new NotDeletedException("不能删除超级管理员用户。");
		}
		User user = userDAO.findOne(id);
		userDAO.delete(user.getId());
		
		// TODO 从shiro中注销
		shiroRealm.clearCachedAuthorizationInfo(user.getUserloginname());
	}
	
	/*
	 */
	@Override
	public List<User> findAll(Page page) {
		org.springframework.data.domain.Page<User> springDataPage = userDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 */
	@Override
	public List<User> findByExample(
			Specification<User> specification, Page page) {
		org.springframework.data.domain.Page<User> springDataPage = userDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/**
	 * 判断是否超级管理员.
	 */
	private boolean isSupervisor(String id) {
		return id.equals("admin");
	}

	@Override
	public void updatePwd(User user, String newPwd) throws ServiceException {
		//设定安全的密码，使用passwordService提供的salt并经过1024次 sha-1 hash
		boolean isMatch = ShiroDbRealm.validatePassword(user.getPlainPassword(), user.getPassword(), user.getSalt());
		if (isMatch) {
			HashPassword hashPassword = ShiroDbRealm.encryptPassword(newPwd);
			user.setSalt(hashPassword.salt);
			user.setPassword(hashPassword.password);
			
			userDAO.save(user);
			shiroRealm.clearCachedAuthorizationInfo(user.getUserloginname());
			
			return; 
		}
		
		throw new IncorrectPasswordException("用户密码错误！");
	}

	@Override
	public void resetPwd(User user, String newPwd) {
		if (newPwd == null) {
			newPwd = "123456";
		}
		
		HashPassword hashPassword = ShiroDbRealm.encryptPassword(newPwd);
		user.setSalt(hashPassword.salt);
		user.setPassword(hashPassword.password);
		
		userDAO.save(user);
	}

	/* 
	 */
	@Override
	public User getByUserloginname(String username) {
		return userDAO.findByUserloginname(username);
	}

	@Override
	public User getByUserloginnameAndCompanyId(String userloginname, String companyId) {
		return userDAO.findByUserloginnameAndCompanyid(userloginname, companyId);
	}
}
