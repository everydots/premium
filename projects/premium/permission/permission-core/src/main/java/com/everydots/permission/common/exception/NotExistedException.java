package com.everydots.permission.common.exception;

/** 
 * 	
 * @author 	hefy
 * Version  1.1.0
 * @since   2015-8-13 上午10:54:15 
 */

public class NotExistedException extends ServiceException {

	/** 描述  */
	private static final long serialVersionUID = -598071452360556064L;

	public NotExistedException() {
		super();
	}

	public NotExistedException(String message) {
		super(message);
	}

	public NotExistedException(Throwable cause) {
		super(cause);
	}

	public NotExistedException(String message, Throwable cause) {
		super(message, cause);
	}
}
