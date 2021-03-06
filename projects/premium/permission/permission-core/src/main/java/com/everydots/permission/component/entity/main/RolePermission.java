/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="role_permission")
public class RolePermission extends IdEntity{
	
    
	/**
	 * 角色权限id
	 */
    @Column(length=20)
    private String rolepermissionid;
    
	/**
	 * 角色ID
	 */
    @Column(length=20)
    private String roleid;
    
	/**
	 * 描述
	 */
    @Column(length=20)
    private String permissionid;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
    
	
	/**
	 * @param rolepermissionid the rolepermissionid to set
	 */
    public void setRolepermissionid(String rolepermissionid){
       this.rolepermissionid = rolepermissionid;
    }
    
    /**
     * @return the rolepermissionid 
     */
    public String getRolepermissionid(){
       return this.rolepermissionid;
    }
	
	/**
	 * @param roleid the roleid to set
	 */
    public void setRoleid(String roleid){
       this.roleid = roleid;
    }
    
    /**
     * @return the roleid 
     */
    public String getRoleid(){
       return this.roleid;
    }
	
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
