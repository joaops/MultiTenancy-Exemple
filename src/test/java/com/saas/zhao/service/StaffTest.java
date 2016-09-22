package com.saas.zhao.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saas.login.Login;
import com.saas.po.Staff;
import com.saas.service.StaffService;
import com.saas.util.ZhaoTime;

public class StaffTest {
    
    StaffService staffService = null;
    AbstractApplicationContext ac = null;
    
    @Before
    public void before() {
        Login.setTenantId("tenant_1");
        ac = new ClassPathXmlApplicationContext("beans.xml");
        staffService = (StaffService) ac.getBean("staffServiceImpl");
        System.out.println(Login.getTenantId() + " Login");
        System.out.println("Open ApplicationContext");
    }
    
    @After
    public void after() {
        System.out.println("close ApplicationContext");
        ac.close();
    }
    
    @Test
    public void getStaff() throws Exception {
        Staff staff = staffService.getStaff(1);
        System.out.println(staff.getRoleId());
    }
    
    public void getAllUsers() throws Exception {
        List<Staff> staffList = staffService.getAllStaff();
        for (Staff staff : staffList){
            System.out.println(staff);
        }
    }
    
    @Test
    public void insert() throws Exception{
        Staff staff = new Staff();
        staff.setStaffId(3);
        staff.setRoleId(3);
        staff.setName("staff3");
        staff.setAccount("staff3");
        staff.setPassword("staff3");
        //Obter a data atual, e inserido no banco de dados
        //staff.setCreateDate(ZhaoTime.getCurrentDate());
        staffService.add(staff);
    }
    
}