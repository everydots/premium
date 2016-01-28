package com.everydots.permission.common.log.impl;

import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.everydots.permission.common.log.LogLevel;
import com.everydots.permission.common.shiro.ShiroUser;
import com.everydots.permission.common.util.SecurityUtils;
import com.everydots.permission.component.entity.main.LogInfo;
import com.everydots.permission.component.service.LogInfoService;


/** 
 * 全局日志等级<包日志等级<类和方法日志等级
 * @author 	hefy
 * Version  2.1.0
 * @since   2013-5-3 下午4:41:55 
 */
public class Log4JDBCImpl extends LogAdapter {
	
	private LogLevel rootLogLevel = LogLevel.ERROR;
	
	private LogInfoService logInfoService;
	
	private Map<String, LogLevel> customLogLevel = new HashMap<String, LogLevel>();

	/**
	 * 
	 * @param message
	 * @param objects
	 * @param logLevel  
	 * @see com.Hefy.ketacustom.log.impl.LogAdapter#log(java.lang.String, java.lang.Object[], com.Hefy.ketacustom.log.LogLevel)
	 */
	@Override
	public void log(String message, Object[] objects, LogLevel logLevel) {	
		
		MessageFormat mFormat = new MessageFormat(message);
		String result = mFormat.format(objects);
		
		if (!StringUtils.isNotBlank(result)) {
			return;
		}
		
		ShiroUser shiroUser = SecurityUtils.getShiroUser();
		
		//result = shiroUser.toString() + ":" + result;
		
		LogInfo logInfo = new LogInfo();
		logInfo.setCreatetime(new Date());
		
		logInfo.setUsername(shiroUser.getLoginName());
		logInfo.setMessage(result);
		logInfo.setIpaddress(shiroUser.getIpAddress());
		logInfo.setLoglevel(logLevel);
		
		logInfoService.saveOrUpdate(logInfo);
	}

	public void setRootLogLevel(LogLevel rootLogLevel) {
		this.rootLogLevel = rootLogLevel;
	}

	/**   
	 * 
	 * @return  
	 * @see com.Hefy.ketacustom.log.LogTemplate#getRootLogLevel()  
	 */
	@Override
	public LogLevel getRootLogLevel() {
		return rootLogLevel;
	}
	
	public void setCustomLogLevel(Map<String, LogLevel> customLogLevel) {
		this.customLogLevel = customLogLevel;
	}
	
	@Override
	public Map<String, LogLevel> getCustomLogLevel() {
		return customLogLevel;
	}

	public void setLogInfoService(LogInfoService logInfoService) {
		this.logInfoService = logInfoService;
	}
	
}
