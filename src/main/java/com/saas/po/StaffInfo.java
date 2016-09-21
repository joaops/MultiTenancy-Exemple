package com.saas.po;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAFFINFO")
public class StaffInfo implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "STAFFINFOID")
    private Integer staffInfoId;
    
    @Column(name = "STAFFID")
    private Integer staffId;
    
    @Column(name = "COUNTRY")
    private String country;
    
    @Column(name = "PROVINCE")
    private String province;
    
    @Column(name = "CITY")
    private String city;
    
    @Column(name = "ADDRESS")
    private String address;
    
    @Column(name = "POSTCODE")
    private String postCode;
    
    @Column(name = "ORGEMAIL")
    private String orgEmail;
    
    @Column(name = "ORGFAX")
    private String orgFax;
    
    @Column(name = "LANDLINEPHONE")
    private String landlinephone;
    
    @Column(name = "TELEPHONE")
    private String telephone;
    
    @Column(name = "SEX")
    private String sex;
    
    @Column(name = "BIRTHDAY")
    private Date birthday;
    
    @Column(name = "CREATEDATE")
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