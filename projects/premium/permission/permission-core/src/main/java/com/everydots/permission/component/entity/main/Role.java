/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="role")
public class Role extends IdEntity{
	
    
	/**
	 * 角色ID
	 */
    @Column(nullable=false, length=20)
    private String roleid;
    
	/**
	 * 角色名称
	 */
    @Column(length=30)
    private String rolename;
    
	/**
	 * 角色描述
	 */
    @Column(length=50)
    private String roledesc;
    
	/**
	 * 所属企业ID
	 */
    @Column(length=20)
    private String companyid;
    
	/**
	 * 状态，见字典 roleStatus
	 */
    @Column(length=2)
    private String status;
    
    
	
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
	 * @param rolename the rolename to set
	 */
    public void setRolename(String rolename){
       this.rolename = rolename;
    }
    
    /**
     * @return the rolename 
     */
    public String getRolename(){
       return this.rolename;
    }
	
	/**
	 * @param roledesc the roledesc to set
	 */
    public void setRoledesc(String roledesc){
       this.roledesc = roledesc;
    }
    
    /**
     * @return the roledesc 
     */
    public String getRoledesc(){
       return this.roledesc;
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
}
