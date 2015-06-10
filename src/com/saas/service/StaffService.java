package com.saas.service;

import java.util.List;

import com.saas.po.Staff;

public interface StaffService {

	public void add(Staff staff) throws Exception;
	
	public void update(Staff staff) throws Exception;
	
	public void delete(Staff staff) throws Exception;
	
	public Staff getStaff(Integer staffId) throws Exception;
	
	public List<Staff> getAllStaff() throws Exception;
}
