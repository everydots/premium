package com.everydots.permission.common.log.impl;

import java.util.HashMap;
import java.util.Map;

import com.everydots.permission.common.log.LogAPI;
import com.everydots.permission.common.log.LogLevel;


/** 
 * 	
 * @author 	hefy
 * Version  2.1.0
 * @since   2013-5-3 下午5:21:07 
 */

public class LogAdapter implements LogAPI {

	/**   
	 * @param message
	 * @param logLevel  
	 * @see com.Hefy.ketacustom.log.LogAPI#log(java.lang.String, com.Hefy.ketacustom.log.LogLevel)  
	 */
	@Override
	public void log(String message, LogLevel logLevel) {
		log(message, null, logLevel);
	}

	/**   
	 * @param message
	 * @param objects
	 * @param logLevel  
	 * @see com.Hefy.ketacustom.log.LogAPI#log(java.lang.String, java.lang.Object[], com.Hefy.ketacustom.log.LogLevel)  
	 */
	@Override
	public void log(String message, Object[] objects, LogLevel logLevel) {
		
	}
	
	/**   
	 * @return  
	 * @see com.Hefy.ketacustom.log.LogAPI#getRootLogLevel()  
	 */
	@Override
	public LogLevel getRootLogLevel() {
		return LogLevel.ERROR;
	}

	/**   
	 * @return  
	 * @see com.Hefy.ketacustom.log.LogAPI#getCustomLogLevel()  
	 */
	@Override
	public Map<String, LogLevel> getCustomLogLevel() {
		return new HashMap<String, LogLevel>();
	}
}
