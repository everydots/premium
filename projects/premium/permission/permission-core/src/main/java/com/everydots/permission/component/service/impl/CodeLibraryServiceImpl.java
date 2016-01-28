/**
 * CodeLibraryServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.CodeLibrary;
import com.everydots.permission.component.dao.CodeLibraryDAO;
import com.everydots.permission.component.service.CodeLibraryService;

@Service
@Transactional
public class CodeLibraryServiceImpl implements CodeLibraryService {
	
	@Autowired
	private CodeLibraryDAO codeLibraryDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CodeLibraryService#get(java.lang.String)  
	 */ 
	@Override
	public CodeLibrary get(String id) {
		return codeLibraryDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.CodeLibraryService#saveOrUpdate(com.everydots.permission.component.entity.main.CodeLibrary)  
	 */
	@Override
	public void saveOrUpdate(CodeLibrary codeLibrary) {
		codeLibraryDAO.save(codeLibrary);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CodeLibraryService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		codeLibraryDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CodeLibraryService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<CodeLibrary> findAll(Page page) {
		org.springframework.data.domain.Page<CodeLibrary> springDataPage = codeLibraryDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.CodeLibraryService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<CodeLibrary> findByExample(
			Specification<CodeLibrary> specification, Page page) {
		org.springframework.data.domain.Page<CodeLibrary> springDataPage = codeLibraryDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
