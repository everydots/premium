/**
 * 
 */
package com.everydots.permission.common.util;

import org.apache.shiro.subject.Subject;

import com.everydots.permission.common.shiro.ShiroUser;
import com.everydots.permission.component.entity.main.User;


/**
 * @author Hefy
 *
 */
public abstract class SecurityUtils {
	public static User getLoginUser() {
		return getShiroUser().getUser();
	}
	
	public static ShiroUser getShiroUser() {
		Subject subject = getSubject();
		ShiroUser shiroUser = (ShiroUser)subject.getPrincipal();
		
		return shiroUser;
	}

	public static Subject getSubject() {
		return org.apache.shiro.SecurityUtils.getSubject();
	}
}
