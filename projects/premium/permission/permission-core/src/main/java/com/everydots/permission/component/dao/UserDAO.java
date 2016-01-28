/**
 * dao
 */
package com.everydots.permission.component.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.everydots.permission.component.entity.main.User;

public interface UserDAO extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {
	User findByUserloginname(String userLoginName);
	User findByUserloginnameAndCompanyid(String userloginname,String companyId);
}