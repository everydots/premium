/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="organization")
public class Organization extends IdEntity{
	
    
	/**
	 * 组织或部门ID
	 */
    @Column(length=20)
    private String organizationid;
    
	/**
	 * 组织或部门名称
	 */
    @Column(length=50)
    private String organizationname;
    
	/**
	 * 组织或部门类型，见字典 organizationType
	 */
    @Column(length=4)
    private String organizationtype;
    
	/**
	 * 所属企业ID
	 */
    @Column(length=20)
    private String companyid;
    
	/**
	 * 上级组织或部门ID
	 */
    @Column(length=20)
    private String parentorganizationid;
    
	/**
	 * 状态，见字典 organizationStatus
	 */
    @Column(length=2)
    private String status;
    
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
	 * @param organizationname the organizationname to set
	 */
    public void setOrganizationname(String organizationname){
       this.organizationname = organizationname;
    }
    
    /**
     * @return the organizationname 
     */
    public String getOrganizationname(){
       return this.organizationname;
    }
	
	/**
	 * @param organizationtype the organizationtype to set
	 */
    public void setOrganizationtype(String organizationtype){
       this.organizationtype = organizationtype;
    }
    
    /**
     * @return the organizationtype 
     */
    public String getOrganizationtype(){
       return this.organizationtype;
    }
	
	/**
	 * @param companyid the companyid to set
	 */
    public void setCompanyid(String companyid){
       this.companyid = companyid;
    }
    
    /**
     * @return the companyid 
     */
    public String getCompanyid(){
       return this.companyid;
    }
	
	/**
	 * @param parentorganizationid the parentorganizationid to set
	 */
    public void setParentorganizationid(String parentorganizationid){
       this.parentorganizationid = parentorganizationid;
    }
    
    /**
     * @return the parentorganizationid 
     */
    public String getParentorganizationid(){
       return this.parentorganizationid;
    }
	
	/**
	 * @param status the status to set
	 */
    public void setStatus(String status){
       this.status = status;
    }
    
    /**
     * @return the status 
     */
    public String getStatus(){
       return this.status;
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
