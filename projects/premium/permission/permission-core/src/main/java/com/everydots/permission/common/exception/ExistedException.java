package com.everydots.permission.common.exception;

/** 
 * 	
 * @author 	hefy
 * Version  1.1.0
 * @since   2015-8-13 上午10:54:15 
 */

public class ExistedException extends ServiceException {

	/** 描述  */
	private static final long serialVersionUID = -598071452360556064L;

	public ExistedException() {
		super();
	}

	public ExistedException(String message) {
		super(message);
	}

	public ExistedException(Throwable cause) {
		super(cause);
	}

	public ExistedException(String message, Throwable cause) {
		super(message, cause);
	}
}
