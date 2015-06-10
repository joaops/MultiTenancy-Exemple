package com.saas.dao;

import java.util.List;

import com.saas.po.Staff;;

public interface StaffDAO {

	public void add(Staff staff);
	
	public void update(Staff staff);
	
	public void delete(Staff staff);
	
	public Staff getStaff(Integer staffId);
	
	public List<Staff> getAllStaff();
}
