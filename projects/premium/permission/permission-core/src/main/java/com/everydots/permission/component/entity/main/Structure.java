/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="structure")
public class Structure extends IdEntity{
	
    
	/**
	 * 节点ID
	 */
    @Column(length=20)
    private String structureid;
    
	/**
	 * 节点名称
	 */
    @Column(length=30)
    private String structurename;
    
	/**
	 * 描述
	 */
    @Column(length=100)
    private String describe;
    
	/**
	 * url
	 */
    @Column(length=100)
    private String url;
    
	/**
	 * 上级节点ID
	 */
    @Column(length=20)
    private String parentstructureid;
    
	/**
	 * 所属系统ID
	 */
    @Column(length=20)
    private String systemid;
    
	/**
	 * 是否叶子节点，见字典 yesOrNo
	 */
    @Column(length=2)
    private String isleaf;
    
	/**
	 * 状态，见字典 menuStatus
	 */
    @Column(length=2)
    private String status;
    
    
    /**
	 * 优先级
	 */
    @Column(length=10)
    private String priority;
    
    /**
	 * 模块名
	 */
    @Column(length=20)
    private String sn;
	
    
    /**
     * 子菜单
     */
    @Transient
    private  List<Structure> children;
    
    /**
	 * 类名
	 */
    @Column(length=100)
    private String classname;
    
	/**
	 * @param structureid the structureid to set
	 */
    public void setStructureid(String structureid){
       this.structureid = structureid;
    }
    
    /**
     * @return the structureid 
     */
    public String getStructureid(){
       return this.structureid;
    }
	
	/**
	 * @param structurename the structurename to set
	 */
    public void setStructurename(String structurename){
       this.structurename = structurename;
    }
    
    /**
     * @return the structurename 
     */
    public String getStructurename(){
       return this.structurename;
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
	 * @param parentstructureid the parentstructureid to set
	 */
    public void setParentstructureid(String parentstructureid){
       this.parentstructureid = parentstructureid;
    }
    
    /**
     * @return the parentstructureid 
     */
    public String getParentstructureid(){
       return this.parentstructureid;
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
	 * @param isleaf the isleaf to set
	 */
    public void setIsleaf(String isleaf){
       this.isleaf = isleaf;
    }
    
    /**
     * @return the isleaf 
     */
    public String getIsleaf(){
       return this.isleaf;
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

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public List<Structure> getChildren() {
		return children;
	}

	public void setChildren(List<Structure> children) {
		this.children = children;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
}
