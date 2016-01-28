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
@Table(name="system_info")
public class System extends IdEntity{
	
    
	/**
	 * 系统ID
	 */
    @Column(nullable=false, length=20)
    private String systemid;
    
	/**
	 * 系统名称，中文全称
	 */
    @Column(length=40)
    private String systemname;
    
	/**
	 * 中文简称
	 */
    @Column(length=20)
    private String shortname;
    
	/**
	 * 英文全称
	 */
    @Column(length=40)
    private String englishname;
    
	/**
	 * 英文简称
	 */
    @Column(length=20)
    private String engshortname;
    
	/**
	 * 系统类型，见字典 systermType
	 */
    @Column(length=3)
    private String systemtype;
    
	/**
	 * 链接url
	 */
    @Column(length=60)
    private String url;
    
	/**
	 * 注册时间
	 */
    @Column(length=19)
	@Temporal(TemporalType.TIMESTAMP)
    private Date registetime;
    
	/**
	 * 状态，见字典 systermStatus
	 */
    @Column(length=2)
    private String status;
    
	/**
	 * 备注
	 */
    @Column(length=100)
    private String remark;
    
    
	
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
	 * @param systemname the systemname to set
	 */
    public void setSystemname(String systemname){
       this.systemname = systemname;
    }
    
    /**
     * @return the systemname 
     */
    public String getSystemname(){
       return this.systemname;
    }
	
	/**
	 * @param shortname the shortname to set
	 */
    public void setShortname(String shortname){
       this.shortname = shortname;
    }
    
    /**
     * @return the shortname 
     */
    public String getShortname(){
       return this.shortname;
    }
	
	/**
	 * @param englishname the englishname to set
	 */
    public void setEnglishname(String englishname){
       this.englishname = englishname;
    }
    
    /**
     * @return the englishname 
     */
    public String getEnglishname(){
       return this.englishname;
    }
	
	/**
	 * @param engshortname the engshortname to set
	 */
    public void setEngshortname(String engshortname){
       this.engshortname = engshortname;
    }
    
    /**
     * @return the engshortname 
     */
    public String getEngshortname(){
       return this.engshortname;
    }
	
	/**
	 * @param systemtype the systemtype to set
	 */
    public void setSystemtype(String systemtype){
       this.systemtype = systemtype;
    }
    
    /**
     * @return the systemtype 
     */
    public String getSystemtype(){
       return this.systemtype;
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
	
	/**
	 * @param remark the remark to set
	 */
    public void setRemark(String remark){
       this.remark = remark;
    }
    
    /**
     * @return the remark 
     */
    public String getRemark(){
       return this.remark;
    }
}
