package com.saas.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.saas.dao.StaffInfoDAO;
//import com.saas.po.Staff;
import com.saas.po.StaffInfo;

public class StaffInfoDAOImpl extends HibernateDaoSupport implements StaffInfoDAO{

	@Override
	public void add(StaffInfo staffInfo) {
		this.getHibernateTemplate().save(staffInfo);
		
	}

	@Override
	public void update(StaffInfo staffInfo) {
		this.getHibernateTemplate().update(staffInfo);
		
	}

	@Override
	public void delete(StaffInfo staffInfo) {
		this.getHibernateTemplate().delete(staffInfo);
		
	}

	@Override
	public StaffInfo getStaffInfo(Integer staffInfoId) {
		return this.getHibernateTemplate().get(StaffInfo.class, staffInfoId);
		
	}

}
