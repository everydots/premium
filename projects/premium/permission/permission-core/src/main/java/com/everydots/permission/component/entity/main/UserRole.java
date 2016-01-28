/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="user_role")
public class UserRole extends IdEntity{
	
    
	/**
	 * 用户ID
	 */
    @Column(length=20)
    private String userid;
    
	/**
	 * 角色ID
	 */
    @Column(length=20)
    private String roleid;
    
	/**
	 * 状态，见字典 userRoleStatus
	 */
    @Column(length=2)
    private String status;
    
    
	
	/**
	 * @param userid the userid to set
	 */
    public void setUserid(String userid){
       this.userid = userid;
    }
    
    /**
     * @return the userid 
     */
    public String getUserid(){
       return this.userid;
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
