package com.everydots.permission.component.entity;

import java.io.Serializable;

/** 
 * 	
 * @author 	hefy
 * @since   2015年10月17日 下午4:13:13 
 */

public interface Idable<T extends Serializable> {
	public T getId();

	public void setId(T id);
}
