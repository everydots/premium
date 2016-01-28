/**
 * entity
 */
package com.everydots.permission.component.entity.main;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everydots.permission.component.entity.IdEntity;

@Entity
@Table(name="widget")
public class Widget extends IdEntity{
	
    
	/**
	 * 控件ID
	 */
    @Column(nullable=false, length=20)
    private String widgetid;
    
	/**
	 * 控件名称
	 */
    @Column(length=20)
    private String widgetname;
    
	/**
	 * 控件类型，见字典 widgetType
	 */
    @Column(length=2)
    private String widgettype;
    
	/**
	 * 所属系统ID
	 */
    @Column(length=20)
    private String systemid;
    
	/**
	 * 所属菜单ID
	 */
    @Column(length=20)
    private String structureid;
    
	/**
	 * 上级控件ID
	 */
    @Column(length=20)
    private String parentwidgetid;
    
	/**
	 * AngularJS模型ID
	 */
    @Column(length=20)
    private String angmodelid;
    
	/**
	 * 绑定的事件声明
	 */
    @Column(length=60)
    private String bindevent;
    
    
	
	/**
	 * @param widgetid the widgetid to set
	 */
    public void setWidgetid(String widgetid){
       this.widgetid = widgetid;
    }
    
    /**
     * @return the widgetid 
     */
    public String getWidgetid(){
       return this.widgetid;
    }
	
	/**
	 * @param widgetname the widgetname to set
	 */
    public void setWidgetname(String widgetname){
       this.widgetname = widgetname;
    }
    
    /**
     * @return the widgetname 
     */
    public String getWidgetname(){
       return this.widgetname;
    }
	
	/**
	 * @param widgettype the widgettype to set
	 */
    public void setWidgettype(String widgettype){
       this.widgettype = widgettype;
    }
    
    /**
     * @return the widgettype 
     */
    public String getWidgettype(){
       return this.widgettype;
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
	 * @param parentwidgetid the parentwidgetid to set
	 */
    public void setParentwidgetid(String parentwidgetid){
       this.parentwidgetid = parentwidgetid;
    }
    
    /**
     * @return the parentwidgetid 
     */
    public String getParentwidgetid(){
       return this.parentwidgetid;
    }
	
	/**
	 * @param angmodelid the angmodelid to set
	 */
    public void setAngmodelid(String angmodelid){
       this.angmodelid = angmodelid;
    }
    
    /**
     * @return the angmodelid 
     */
    public String getAngmodelid(){
       return this.angmodelid;
    }
	
	/**
	 * @param bindevent the bindevent to set
	 */
    public void setBindevent(String bindevent){
       this.bindevent = bindevent;
    }
    
    /**
     * @return the bindevent 
     */
    public String getBindevent(){
       return this.bindevent;
    }
}
