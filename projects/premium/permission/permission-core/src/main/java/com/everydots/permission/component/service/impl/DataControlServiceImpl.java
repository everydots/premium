/**
 * DataControlServiceImpl
 */
package	com.everydots.permission.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everydots.permission.common.util.util.dwz.Page;
import com.everydots.permission.common.util.util.dwz.PageUtils;
import com.everydots.permission.component.entity.main.DataControl;
import com.everydots.permission.component.dao.DataControlDAO;
import com.everydots.permission.component.service.DataControlService;

@Service
@Transactional
public class DataControlServiceImpl implements DataControlService {
	
	@Autowired
	private DataControlDAO dataControlDAO;

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.DataControlService#get(java.lang.String)  
	 */ 
	@Override
	public DataControl get(String id) {
		return dataControlDAO.findOne(id);
	}

	/*
	 * (non-Javadoc) 
	 * @see com.everydots.permission.component.service.DataControlService#saveOrUpdate(com.everydots.permission.component.entity.main.DataControl)  
	 */
	@Override
	public void saveOrUpdate(DataControl dataControl) {
		dataControlDAO.save(dataControl);
	}

	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.DataControlService#delete(java.lang.String)  
	 */
	@Override
	public void delete(String id) {
		dataControlDAO.delete(id);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.DataControlService#findAll(com.everydots.permission.common.util.util.dwz.Page)  
	 */
	@Override
	public List<DataControl> findAll(Page page) {
		org.springframework.data.domain.Page<DataControl> springDataPage = dataControlDAO.findAll(PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.everydots.permission.component.service.DataControlService#findByExample(org.springframework.data.jpa.domain.Specification, com.everydots.permission.common.util.util.dwz.Page)	
	 */
	@Override
	public List<DataControl> findByExample(
			Specification<DataControl> specification, Page page) {
		org.springframework.data.domain.Page<DataControl> springDataPage = dataControlDAO.findAll(specification, PageUtils.createPageable(page));
		page.setTotalCount(springDataPage.getTotalElements());
		return springDataPage.getContent();
	}

	@Override
	public DataControl findByDatacontrolid(String datacontrolid) {
		// TODO Auto-generated method stub
		return dataControlDAO.findByDatacontrolid(datacontrolid);
	}
}
