/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="data_control")
public class DataControl extends IdEntity{
	
    
	/**
	 * 数据控制id
	 */
    @Column(length=20)
    private String datacontrolid;
    
	/**
	 * 控制逻辑
	 */
    @Column(length=512)
    private String control;
    
	/**
	 * 名称
	 */
    @Column(length=64)
    private String name;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
    
	
	
	public String getDatacontrolid() {
		return datacontrolid;
	}

	public void setDatacontrolid(String datacontrolid) {
		this.datacontrolid = datacontrolid;
	}

	/**
	 * @param control the control to set
	 */
    public void setControl(String control){
       this.control = control;
    }
    
    /**
     * @return the control 
     */
    public String getControl(){
       return this.control;
    }
	
	/**
	 * @param name the name to set
	 */
    public void setName(String name){
       this.name = name;
    }
    
    /**
     * @return the name 
     */
    public String getName(){
       return this.name;
    }
	
	/**
	 * @param describe the describe to set
	 */
    public void setDescribe(String describe){
       this.describe = describe;
    }
    
    /**
     * @return the describe 
     */
    public String getDescribe(){
       return this.describe;
    }
}
