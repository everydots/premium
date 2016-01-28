package com.everydots.permission.common.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.util.WebUtils;

import com.everydots.permission.common.constants.SecurityConstants;


/**
 * 
 * @author hefy 
 * Version 1.1.0
 * @since 2015-8-7 上午9:20:26
 */

public class CaptchaFormAuthenticationFilter extends BaseFormAuthenticationFilter {

	private String captchaParam = SecurityConstants.CAPTCHA_KEY;
	private String companyIdParam = SecurityConstants.COMPANYID_KEY;

	public String getCaptchaParam() {
		return captchaParam;
	}

	public String getCompanyIdParam(){
		return companyIdParam;
	}
	
	protected String getCaptcha(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaParam());
	}
	
	protected String getCompanyId(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCompanyIdParam());
	}

	@Override
	protected AuthenticationToken createToken(ServletRequest request,
			ServletResponse response) {
		String username = getUsername(request);
		String password = getPassword(request);
		String captcha = getCaptcha(request);
		String companyId = getCompanyId(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);
		return new CaptchaUsernamePasswordToken(username, password, rememberMe,
				host, captcha,companyId);
	}

}
