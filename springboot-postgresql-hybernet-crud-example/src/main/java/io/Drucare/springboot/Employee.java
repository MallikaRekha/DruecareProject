package io.Drucare.springboot;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
	@Column(name="first_name")
private String firstname;
	@Column(name="middle_name")
	private String middlename;
	@Column(name="last_name")
private String lastname;
	@Column(name="emailid")
private String emailid;
	@Column(name="mobile_no")
	private long mobileno;
	@Column(name="address")
	private String address;
	@Column(name="statet_name")
	private String stateName;
	@Column(name="country_name")
	private String countryName;
	@Column(name="city_name")
	private String cityName;
	@Column(name="pin_code")
	private String pincode;
	@Column(name="emp_code")
	private String empcode;
	@Column(name="alternate_phnumber")
	private long alternatePhNumber;



public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


public Employee(long id, String firstname, String middlename, String lastname, String emailid, long mobileno,
		String address, String stateName, String countryName, String cityName, String pincode, String empcode,
		long alternatePhNumber) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.middlename = middlename;
	this.lastname = lastname;
	this.emailid = emailid;
	this.mobileno = mobileno;
	this.address = address;
	this.stateName = stateName;
	this.countryName = countryName;
	this.cityName = cityName;
	this.pincode = pincode;
	this.empcode = empcode;
	this.alternatePhNumber = alternatePhNumber;
}


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getMiddlename() {
	return middlename;
}
public void setMiddlename(String middlename) {
	this.middlename = middlename;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getEmpcode() {
	return empcode;
}
public void setEmpcode(String empcode) {
	this.empcode = empcode;
}
public long getAlternatePhNumber() {
	return alternatePhNumber;
}
public void setAlternatePhNumber(long alternatePhNumber) {
	this.alternatePhNumber = alternatePhNumber;
}
@Override
public String toString() {
    return "Employee [employeeId=" + id + ", firstname=" + firstname + ", middlename="+ middlename +", lastname="+ lastname +", emailId=" + emailid
   + ",mobileno="+ mobileno +",address="+ address +",statename="+ stateName +",countryname="+ countryName +",cityname="+ cityName +",pincode="+ pincode +",empcode="+ empcode +",alternatephnumber="+ alternatePhNumber +" ]";
}
}