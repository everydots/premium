/**
 * entity
 */
package com.everydots.permission.component.entity.main;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="company")
public class Company extends IdEntity{
	
    
	/**
	 * 企业ID
	 */
    @Column(nullable=false, length=20)
    private String orgid;
    
	/**
	 * 企业编号，企业简称
	 */
    @Column(nullable=false, length=20)
    private String companycode;
    
	/**
	 * 企业名称，全称
	 */
    @Column(length=60)
    private String companyname;
    
	/**
	 * 链接url
	 */
    @Column(length=120)
    private String url;
    
	/**
	 * 注册本平台时间
	 */
    @Column(length=19)
	@Temporal(TemporalType.TIMESTAMP)
    private Date registetime;
    
	/**
	 * 状态，见字典 orgStatus
	 */
    @Column(length=3)
    private String status;
    
    
	
	/**
	 * @param orgid the orgid to set
	 */
    public void setOrgid(String orgid){
       this.orgid = orgid;
    }
    
    /**
     * @return the orgid 
     */
    public String getOrgid(){
       return this.orgid;
    }
	
	/**
	 * @param companycode the companycode to set
	 */
    public void setCompanycode(String companycode){
       this.companycode = companycode;
    }
    
    /**
     * @return the companycode 
     */
    public String getCompanycode(){
       return this.companycode;
    }
	
	/**
	 * @param companyname the companyname to set
	 */
    public void setCompanyname(String companyname){
       this.companyname = companyname;
    }
    
    /**
     * @return the companyname 
     */
    public String getCompanyname(){
       return this.companyname;
    }
	
	/**
	 * @param url the url to set
	 */
    public void setUrl(String url){
       this.url = url;
    }
    
    /**
     * @return the url 
     */
    public String getUrl(){
       return this.url;
    }
	
	/**
	 * @param registetime the registetime to set
	 */
    public void setRegistetime(Date registetime){
       this.registetime = registetime;
    }
    
    /**
     * @return the registetime 
     */
    public Date getRegistetime(){
       return this.registetime;
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
