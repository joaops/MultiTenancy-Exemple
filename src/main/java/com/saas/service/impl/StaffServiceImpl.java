package com.saas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.saas.dao.StaffDAO;
import com.saas.po.Staff;
import com.saas.service.StaffService;


@Service
public class StaffServiceImpl implements StaffService {
	
	
	@Autowired
	private StaffDAO staffDao;
	
	public StaffServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Staff staff) throws Exception {
		if (staff != null){
			staffDao.add(staff);
		}
	}

	@Override
	public void update(Staff staff) throws Exception {
		if(staff != null && staff.getStaffId() != null){
			
			Staff emp = staffDao.getStaff(staff.getStaffId());
			
			if (emp != null){
				emp.setName(staff.getName());
				emp.setName(staff.getName());
				
				staffDao.update(emp);
				
			}
			
		}

	}

	@Override
	public void delete(Staff staff) throws Exception {
		Staff emp = staffDao.getStaff(staff.getStaffId());
		
		if (emp != null){
			staffDao.delete(emp);
		}

	}

	@Override
	public Staff getStaff(Integer staffId) throws Exception {
		
		
		return staffDao.getStaff(staffId);
	}

	@Override
	public List<Staff> getAllStaff() throws Exception {

		return staffDao.getAllStaff();
	}



}
