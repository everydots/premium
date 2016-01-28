/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="role_permission_data_control")
public class RolePermissionDataControl extends IdEntity{
	
    
	/**
	 * 数据权限id
	 */
    @Column(length=20)
    private String datacontrolid;
    
	/**
	 * 角色权限id
	 */
    @Column(length=20)
    private String rolepermissionid;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
    
	
	/**
	 * @param datacontrolid the datacontrolid to set
	 */
    public void setDatacontrolid(String datacontrolid){
       this.datacontrolid = datacontrolid;
    }
    
    /**
     * @return the datacontrolid 
     */
    public String getDatacontrolid(){
       return this.datacontrolid;
    }
	
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
