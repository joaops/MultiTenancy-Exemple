package com.saas.po;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

	private Integer staffId;
	private Integer roleId;
	private String name;
	private String account;
	private String password;
	
	
	
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
