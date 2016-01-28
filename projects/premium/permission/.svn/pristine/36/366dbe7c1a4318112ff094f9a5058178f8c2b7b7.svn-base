/**
 * StructureServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.Structure;
import com.everydots.permission.component.dao.StructureDAO;
import com.everydots.permission.component.service.StructureService;

@Service
@Transactional
public class StructureServiceImpl implements StructureService {
	
	@Autowired
	private StructureDAO structureDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.StructureService#get(java.lang.String)  
	 */ 
	@Override
	public Structure get(String id) {
		return structureDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.StructureService#saveOrUpdate(com.everydots.permission.component.entity.main.Structure)  
	 */
	@Override
	public void saveOrUpdate(Structure structure) {
		structureDAO.save(structure);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.StructureService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		structureDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.StructureService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<Structure> findAll(Page page) {
		org.springframework.data.domain.Page<Structure> springDataPage = structureDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.StructureService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<Structure> findByExample(
			Specification<Structure> specification, Page page) {
		org.springframework.data.domain.Page<Structure> springDataPage = structureDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public Structure getTree() {
		List<Structure> list = structureDAO.findAllWithCach();
		
		
		List<Structure> rootList = makeTree(list);
		
		return rootList.get(0);
	}

	private List<Structure> makeTree(List<Structure> list) {
		List<Structure> parent = new ArrayList<Structure>();
		// get parentId = null;
		for (Structure e : list) {
			if (StringUtils.isEmpty(e.getParentstructureid())) {
				e.setChildren(new ArrayList<Structure>(0));
				parent.add(e);
			}
		}
		// 删除parentId = null;
		list.removeAll(parent);
		
		makeChildren(parent, list);
		
		return parent;
	}

	private void makeChildren(List<Structure> parent, List<Structure> children) {
		if (children.isEmpty()) {
			return ;
		}
		
		List<Structure> tmp = new ArrayList<Structure>();
		for (Structure c1 : parent) {
			for (Structure c2 : children) {
				c2.setChildren(new ArrayList<Structure>(0));
				if (c1.getId().equals(c2.getParentstructureid())) {
					c1.getChildren().add(c2);
					tmp.add(c2);
				}
			}
		}
		
		children.removeAll(tmp);
		
		makeChildren(tmp, children);
		
	}

	@Override
	public Structure findByStructureid(String structureid) {
		return structureDAO.findByStructureid(structureid);
	}
}
