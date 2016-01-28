/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="organization_detail")
public class OrganizationDetail extends IdEntity{
	
    
	/**
	 * 组织或部门ID
	 */
    @Column(nullable=false, length=20)
    private String organizationid;
    
	/**
	 * 组织或部门负责人
	 */
    @Column(length=20)
    private String manageruserid;
    
    
	
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
	 * @param manageruserid the manageruserid to set
	 */
    public void setManageruserid(String manageruserid){
       this.manageruserid = manageruserid;
    }
    
    /**
     * @return the manageruserid 
     */
    public String getManageruserid(){
       return this.manageruserid;
    }
}
