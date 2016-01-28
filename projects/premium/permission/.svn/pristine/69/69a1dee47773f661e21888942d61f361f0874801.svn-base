/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="code_library")
public class CodeLibrary extends IdEntity{
	
    
	/**
	 * 字典编号
	 */
    @Column(nullable=false, length=20)
    private String codeno;
    
	/**
	 * 字典名称
	 */
    @Column(length=40)
    private String codename;
    
	/**
	 * 子项值
	 */
    @Column(length=10)
    private String itemno;
    
	/**
	 * 子项名称
	 */
    @Column(length=30)
    private String itemname;
    
	/**
	 * 域编号
	 */
    @Column(length=20)
    private String dono;
    
	/**
	 * 域名称
	 */
    @Column(length=40)
    private String doname;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
	/**
	 * 状态，见字典 codeStatus
	 */
    @Column(length=2)
    private String status;
    
    
	
	/**
	 * @param codeno the codeno to set
	 */
    public void setCodeno(String codeno){
       this.codeno = codeno;
    }
    
    /**
     * @return the codeno 
     */
    public String getCodeno(){
       return this.codeno;
    }
	
	/**
	 * @param codename the codename to set
	 */
    public void setCodename(String codename){
       this.codename = codename;
    }
    
    /**
     * @return the codename 
     */
    public String getCodename(){
       return this.codename;
    }
	
	/**
	 * @param itemno the itemno to set
	 */
    public void setItemno(String itemno){
       this.itemno = itemno;
    }
    
    /**
     * @return the itemno 
     */
    public String getItemno(){
       return this.itemno;
    }
	
	/**
	 * @param itemname the itemname to set
	 */
    public void setItemname(String itemname){
       this.itemname = itemname;
    }
    
    /**
     * @return the itemname 
     */
    public String getItemname(){
       return this.itemname;
    }
	
	/**
	 * @param dono the dono to set
	 */
    public void setDono(String dono){
       this.dono = dono;
    }
    
    /**
     * @return the dono 
     */
    public String getDono(){
       return this.dono;
    }
	
	/**
	 * @param doname the doname to set
	 */
    public void setDoname(String doname){
       this.doname = doname;
    }
    
    /**
     * @return the doname 
     */
    public String getDoname(){
       return this.doname;
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
