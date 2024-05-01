package com.mvn.DependencyInjectionObject;

public class AddressBean {
private String houseNum;
private String city;
private String state;
private String pincode;
public AddressBean(String housenum,String city,String state,String pincode) {
	this.houseNum = housenum;
	  this.city=city;
	  this.state=state;
	  this.pincode=pincode;
}
public AddressBean() {
	
}
public String getHouseNum() { 
	  return this. houseNum; 
	 } 
	 public void setHouseNum(String houseNum) { 
	  this.houseNum = houseNum; 
	 } 
	 public String getCity() { 
	  return this.city; 
	 } 
	 public void setCity(String city) { 
	  this.city = city; 
	 } 
	 public String getState() { 
	  return this.state; 
	 } 
	 public void setState(String state) { 
	  this.state = state; 
	 } 
	 public String getPincode() { 
	  return this.pincode; 
	 } 
	 public void setPincode(String pincode) { 
	  this.pincode = pincode; 
	 }

}
