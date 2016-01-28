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
@Table(name="company_detail")
public class CompanyDetail extends IdEntity{
	
    
	/**
	 * 企业ID
	 */
    @Column(nullable=false, length=20)
    private String companyid;
    
	/**
	 * 企业名称
	 */
    @Column(length=60)
    private String companyname;
    
	/**
	 * 英文名称，全称
	 */
    @Column(length=60)
    private String companyenglishname;
    
	/**
	 * 企业证件类型，见字典 companyCertType
	 */
    @Column(length=2)
    private String companycerttype;
    
	/**
	 * 企业证件号码
	 */
    @Column(length=30)
    private String companycertno;
    
	/**
	 * 企业联系电话
	 */
    @Column(length=30)
    private String telphoneno;
    
	/**
	 * 企业地址
	 */
    @Column(length=100)
    private String address;
    
	/**
	 * 企业邮箱
	 */
    @Column(length=30)
    private String email;
    
	/**
	 * 企业传真
	 */
    @Column(length=20)
    private String fox;
    
	/**
	 * 法人代表名称
	 */
    @Column(length=10)
    private String legalname;
    
	/**
	 * 法人证件类型，见字典 personCertType
	 */
    @Column(length=2)
    private String legalcerttype;
    
	/**
	 * 法人证件号码
	 */
    @Column(length=30)
    private String legalcertno;
    
	/**
	 * 法人联系方式(手机)
	 */
    @Column(length=30)
    private String legalmobileno;
    
	/**
	 * 注册时间
	 */
    @Column(length=19)
	@Temporal(TemporalType.TIMESTAMP)
    private Date registetime;
    
	/**
	 * 所属国别，见字典 country
	 */
    @Column(length=4)
    private String country;
    
	/**
	 * 所属行业，见字典 industryType
	 */
    @Column(length=4)
    private String ndustrytype;
    
	/**
	 * 规模等级，见字典 scaleLevel
	 */
    @Column(length=2)
    private String scalelevel;
    
	/**
	 * 企业性质，见字典 orgNature 
	 */
    @Column(length=4)
    private String orgnature;
    
	/**
	 * 企业认证等级，见字典 orgAuthlevel
	 */
    @Column(length=3)
    private String orgauthlevel;
    
	/**
	 * 备注
	 */
    @Column(length=100)
    private String remark;
    
	/**
	 * 备用字段1
	 */
    @Column(length=20)
    private String attribute1;
    
	/**
	 * 备用字段2
	 */
    @Column(length=20)
    private String attribute2;
    
	/**
	 * 备用字段3
	 */
    @Column(length=20)
    private String attribute3;
    
    
	
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
	 * @param companyenglishname the companyenglishname to set
	 */
    public void setCompanyenglishname(String companyenglishname){
       this.companyenglishname = companyenglishname;
    }
    
    /**
     * @return the companyenglishname 
     */
    public String getCompanyenglishname(){
       return this.companyenglishname;
    }
	
	/**
	 * @param companycerttype the companycerttype to set
	 */
    public void setCompanycerttype(String companycerttype){
       this.companycerttype = companycerttype;
    }
    
    /**
     * @return the companycerttype 
     */
    public String getCompanycerttype(){
       return this.companycerttype;
    }
	
	/**
	 * @param companycertno the companycertno to set
	 */
    public void setCompanycertno(String companycertno){
       this.companycertno = companycertno;
    }
    
    /**
     * @return the companycertno 
     */
    public String getCompanycertno(){
       return this.companycertno;
    }
	
	/**
	 * @param telphoneno the telphoneno to set
	 */
    public void setTelphoneno(String telphoneno){
       this.telphoneno = telphoneno;
    }
    
    /**
     * @return the telphoneno 
     */
    public String getTelphoneno(){
       return this.telphoneno;
    }
	
	/**
	 * @param address the address to set
	 */
    public void setAddress(String address){
       this.address = address;
    }
    
    /**
     * @return the address 
     */
    public String getAddress(){
       return this.address;
    }
	
	/**
	 * @param email the email to set
	 */
    public void setEmail(String email){
       this.email = email;
    }
    
    /**
     * @return the email 
     */
    public String getEmail(){
       return this.email;
    }
	
	/**
	 * @param fox the fox to set
	 */
    public void setFox(String fox){
       this.fox = fox;
    }
    
    /**
     * @return the fox 
     */
    public String getFox(){
       return this.fox;
    }
	
	/**
	 * @param legalname the legalname to set
	 */
    public void setLegalname(String legalname){
       this.legalname = legalname;
    }
    
    /**
     * @return the legalname 
     */
    public String getLegalname(){
       return this.legalname;
    }
	
	/**
	 * @param legalcerttype the legalcerttype to set
	 */
    public void setLegalcerttype(String legalcerttype){
       this.legalcerttype = legalcerttype;
    }
    
    /**
     * @return the legalcerttype 
     */
    public String getLegalcerttype(){
       return this.legalcerttype;
    }
	
	/**
	 * @param legalcertno the legalcertno to set
	 */
    public void setLegalcertno(String legalcertno){
       this.legalcertno = legalcertno;
    }
    
    /**
     * @return the legalcertno 
     */
    public String getLegalcertno(){
       return this.legalcertno;
    }
	
	/**
	 * @param legalmobileno the legalmobileno to set
	 */
    public void setLegalmobileno(String legalmobileno){
       this.legalmobileno = legalmobileno;
    }
    
    /**
     * @return the legalmobileno 
     */
    public String getLegalmobileno(){
       return this.legalmobileno;
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
	 * @param country the country to set
	 */
    public void setCountry(String country){
       this.country = country;
    }
    
    /**
     * @return the country 
     */
    public String getCountry(){
       return this.country;
    }
	
	/**
	 * @param ndustrytype the ndustrytype to set
	 */
    public void setNdustrytype(String ndustrytype){
       this.ndustrytype = ndustrytype;
    }
    
    /**
     * @return the ndustrytype 
     */
    public String getNdustrytype(){
       return this.ndustrytype;
    }
	
	/**
	 * @param scalelevel the scalelevel to set
	 */
    public void setScalelevel(String scalelevel){
       this.scalelevel = scalelevel;
    }
    
    /**
     * @return the scalelevel 
     */
    public String getScalelevel(){
       return this.scalelevel;
    }
	
	/**
	 * @param orgnature the orgnature to set
	 */
    public void setOrgnature(String orgnature){
       this.orgnature = orgnature;
    }
    
    /**
     * @return the orgnature 
     */
    public String getOrgnature(){
       return this.orgnature;
    }
	
	/**
	 * @param orgauthlevel the orgauthlevel to set
	 */
    public void setOrgauthlevel(String orgauthlevel){
       this.orgauthlevel = orgauthlevel;
    }
    
    /**
     * @return the orgauthlevel 
     */
    public String getOrgauthlevel(){
       return this.orgauthlevel;
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
	
	/**
	 * @param attribute1 the attribute1 to set
	 */
    public void setAttribute1(String attribute1){
       this.attribute1 = attribute1;
    }
    
    /**
     * @return the attribute1 
     */
    public String getAttribute1(){
       return this.attribute1;
    }
	
	/**
	 * @param attribute2 the attribute2 to set
	 */
    public void setAttribute2(String attribute2){
       this.attribute2 = attribute2;
    }
    
    /**
     * @return the attribute2 
     */
    public String getAttribute2(){
       return this.attribute2;
    }
	
	/**
	 * @param attribute3 the attribute3 to set
	 */
    public void setAttribute3(String attribute3){
       this.attribute3 = attribute3;
    }
    
    /**
     * @return the attribute3 
     */
    public String getAttribute3(){
       return this.attribute3;
    }
}
