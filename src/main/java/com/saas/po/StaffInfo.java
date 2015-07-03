package com.saas.po;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "staffinfo")
public class StaffInfo {

	private Integer staffId;
	private Integer staffInfoId;
	private String country;
	private String province;
	private String city;
	private String address;
	private String postCode;
	private String orgEmail;
	private String orgFax;
	private String landlinephone;
	private String telephone;
	private String sex;
	private Date birthday;
	private Date createDate;
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public Integer getStaffInfoId() {
		return staffInfoId;
	}
	public void setStaffInfoId(Integer staffInfoId) {
		this.staffInfoId = staffInfoId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getOrgEmail() {
		return orgEmail;
	}
	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}
	public String getOrgFax() {
		return orgFax;
	}
	public void setOrgFax(String orgFax) {
		this.orgFax = orgFax;
	}
	public String getLandlinephone() {
		return landlinephone;
	}
	public void setLandlinephone(String landlinephone) {
		this.landlinephone = landlinephone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
