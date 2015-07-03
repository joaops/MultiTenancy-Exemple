package com.saas.dao;

import com.saas.po.StaffInfo;

public interface StaffInfoDAO {
	
	public void add(StaffInfo staffInfo);
	
	public void update(StaffInfo staffInfo);
	
	public void delete(StaffInfo staffInfo);
	
	public StaffInfo getStaffInfo(Integer staffInfoId);
	
}
