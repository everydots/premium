/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="permission")
public class Permission extends IdEntity{
	
    
	/**
	 * 权限id
	 */
    @Column(length=20)
    private String permissionid;
    
	/**
	 * 系统id
	 */
    @Column(length=20)
    private String systemid;
    
	/**
	 * 资源类型
	 */
    @Column(length=4)
    private String resourcetype;
    
	/**
	 * 资源id
	 */
    @Column(length=20)
    private String resourceid;
    
	/**
	 * 操作
	 */
    @Column(length=10)
    private String operate;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
    
	
	/**
	 * @param permissionid the permissionid to set
	 */
    public void setPermissionid(String permissionid){
       this.permissionid = permissionid;
    }
    
    /**
     * @return the permissionid 
     */
    public String getPermissionid(){
       return this.permissionid;
    }
	
	/**
	 * @param systemid the systemid to set
	 */
    public void setSystemid(String systemid){
       this.systemid = systemid;
    }
    
    /**
     * @return the systemid 
     */
    public String getSystemid(){
       return this.systemid;
    }
	
	/**
	 * @param resourcetype the resourcetype to set
	 */
    public void setResourcetype(String resourcetype){
       this.resourcetype = resourcetype;
    }
    
    /**
     * @return the resourcetype 
     */
    public String getResourcetype(){
       return this.resourcetype;
    }
	
	/**
	 * @param resourceid the resourceid to set
	 */
    public void setResourceid(String resourceid){
       this.resourceid = resourceid;
    }
    
    /**
     * @return the resourceid 
     */
    public String getResourceid(){
       return this.resourceid;
    }
	
	/**
	 * @param operate the operate to set
	 */
    public void setOperate(String operate){
       this.operate = operate;
    }
    
    /**
     * @return the operate 
     */
    public String getOperate(){
       return this.operate;
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
