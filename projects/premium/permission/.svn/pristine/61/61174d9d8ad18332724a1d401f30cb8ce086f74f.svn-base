/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="role_organization")
public class RoleOrganization extends IdEntity{
	
    
	/**
	 * 组织或部门ID
	 */
    @Column(nullable=false, length=20)
    private String organizationid;
    
	/**
	 * 角色ID
	 */
    @Column(nullable=false, length=20)
    private String roleid;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
    
	
	/**
	 * @param organizationid the organizationid to set
	 */
    public void setOrganizationid(String organizationid){
       this.organizationid = organizationid;
    }
    
    /**
     * @return the organizationid 
     */
    public String getOrganizationid(){
       return this.organizationid;
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
