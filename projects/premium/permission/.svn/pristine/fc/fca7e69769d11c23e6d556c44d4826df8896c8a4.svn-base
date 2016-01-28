/**
 * LogInfoServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.LogInfo;
import com.everydots.permission.component.dao.LogInfoDAO;
import com.everydots.permission.component.service.LogInfoService;

@Service
@Transactional
public class LogInfoServiceImpl implements LogInfoService {
	
	@Autowired
	private LogInfoDAO logInfoDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.LogInfoService#get(java.lang.String)  
	 */ 
	@Override
	public LogInfo get(String id) {
		return logInfoDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.LogInfoService#saveOrUpdate(com.everydots.permission.component.entity.main.LogInfo)  
	 */
	@Override
	public void saveOrUpdate(LogInfo logInfo) {
		logInfoDAO.save(logInfo);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.LogInfoService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		logInfoDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.LogInfoService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<LogInfo> findAll(Page page) {
		org.springframework.data.domain.Page<LogInfo> springDataPage = logInfoDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.LogInfoService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<LogInfo> findByExample(
			Specification<LogInfo> specification, Page page) {
		org.springframework.data.domain.Page<LogInfo> springDataPage = logInfoDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
}
