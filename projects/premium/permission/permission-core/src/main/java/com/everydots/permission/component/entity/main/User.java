/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="user")
public class User extends IdEntity{
	
    
	/**
	 * 用户ID
	 */
    @Column(nullable=false, length=30)
    private String userid;
    
	/**
	 * 用户登录名
	 */
    @Column(length=30)
    private String userloginname;
    
	/**
	 * 登录密码
	 */
    @Column(length=20)
    private String password;
    
	/**
	 * 所属企业ID
	 */
    @Column(length=30)
    private String companyid;
    
	/**
	 * 所属组织或部门ID
	 */
    @Column(length=30)
    private String orgnizationid;
    
	/**
	 * 状态，见字典 userStatus
	 */
    @Column(length=2)
    private String status;
    
    /**
     * 加密使用salt
     */
	@Column(length=32, nullable=false)
	private String salt;
	
	/**
	 * 明文密码
	 */
	@Transient
	private String plainPassword;
	
	
	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}

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
	 * @param userloginname the userloginname to set
	 */
    public void setUserloginname(String userloginname){
       this.userloginname = userloginname;
    }
    
    /**
     * @return the userloginname 
     */
    public String getUserloginname(){
       return this.userloginname;
    }
	
	/**
	 * @param password the password to set
	 */
    public void setPassword(String password){
       this.password = password;
    }
    
    /**
     * @return the password 
     */
    public String getPassword(){
       return this.password;
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
	 * @param orgnizationid the orgnizationid to set
	 */
    public void setOrgnizationid(String orgnizationid){
       this.orgnizationid = orgnizationid;
    }
    
    /**
     * @return the orgnizationid 
     */
    public String getOrgnizationid(){
       return this.orgnizationid;
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
	 * 返回 salt 的值   
	 * @return salt  
	 */
	public String getSalt() {
		return salt;
	}

	/**  
	 * 设置 salt 的值  
	 * @param salt
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
}
