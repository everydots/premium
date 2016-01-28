package com.everydots.permission.common.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 
 * @author hefy 
 * Version 1.1.0
 * @since 2015-8-7 上午9:21:32
 */

public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {
	/** 描述 */
	private static final long serialVersionUID = -3178260335127476542L;

	private String captcha;
	
	private String companyId;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public CaptchaUsernamePasswordToken() {
		super();
	}

	public CaptchaUsernamePasswordToken(String username, String password,
			boolean rememberMe, String host, String captcha,String companyId) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
		this.companyId = companyId;
	}

}
