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

import com.everydots.permission.common.log.LogLevel;
import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="log_info")
public class LogInfo extends IdEntity{
	
    
	/**
	 * 日志内容
	 */
    @Column(length=256)
    private String message;
    
	/**
	 * 操作
	 */
    @Column(length=10)
    private String operate;
    
	/**
	 * 创建日期
	 */
    @Column(length=19)
	@Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    
	/**
	 * IP地址
	 */
    @Column(length=16)
    private String ipaddress;
    
	/**
	 * 日志级别
	 */
    @Column(length=16)
    private LogLevel loglevel;
    
	/**
	 * 操作用户ID
	 */
    @Column(length=20)
    private String userid;
    
	/**
	 * 操作用户名称
	 */
    @Column(length=60)
    private String username;
    
	/**
	 * 企业ID
	 */
    @Column(length=20)
    private String companyid;
    
	/**
	 * 企业名称
	 */
    @Column(length=60)
    private String companyname;
    
	/**
	 * 系统ID
	 */
    @Column(length=20)
    private String systemid;
    
	/**
	 * 系统名称
	 */
    @Column(length=60)
    private String systemname;
    
	/**
	 * url
	 */
    @Column(length=200)
    private String url;
    
    
	
	/**
	 * @param message the message to set
	 */
    public void setMessage(String message){
       this.message = message;
    }
    
    /**
     * @return the message 
     */
    public String getMessage(){
       return this.message;
    }
	
	/**
	 * @param operate the operate to set
	 */
    public void setOperate(String operate){
       this.operate = operate;
    }
    
    /**
     * @return the operate 
     */
    public String getOperate(){
       return this.operate;
    }
	
	/**
	 * @param createtime the createtime to set
	 */
    public void setCreatetime(Date createtime){
       this.createtime = createtime;
    }
    
    /**
     * @return the createtime 
     */
    public Date getCreatetime(){
       return this.createtime;
    }
	
	/**
	 * @param ipaddress the ipaddress to set
	 */
    public void setIpaddress(String ipaddress){
       this.ipaddress = ipaddress;
    }
    
    /**
     * @return the ipaddress 
     */
    public String getIpaddress(){
       return this.ipaddress;
    }
	
	/**
	 * @param loglevel the loglevel to set
	 */
    public void setLoglevel(LogLevel loglevel){
       this.loglevel = loglevel;
    }
    
    /**
     * @return the loglevel 
     */
    public LogLevel getLoglevel(){
       return this.loglevel;
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
	 * @param username the username to set
	 */
    public void setUsername(String username){
       this.username = username;
    }
    
    /**
     * @return the username 
     */
    public String getUsername(){
       return this.username;
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
}
