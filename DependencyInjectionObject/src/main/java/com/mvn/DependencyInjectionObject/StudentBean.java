package com.mvn.DependencyInjectionObject;

public class StudentBean {
private int StudentId;
private String StudentName;
private AddressBean addressBean;
public StudentBean(int StudentId,String StudentName,AddressBean addressBean) {
	this.StudentId=StudentId;
	this.StudentName=StudentName;
	this.addressBean=addressBean;
}
public StudentBean() {
	
}
public void print() {
	System.out.println(this.StudentId);
	System.out.println(this.StudentName);
	System.out.println(this.addressBean.getHouseNum());
	System.out.println(this.addressBean.getCity());
	System.out.println(this.addressBean.getState());
	System.out.println(this.addressBean.getPincode());
	
}
public int getStudentId() { 
	  return this.StudentId; 
	 } 
	 public void setStudentId(int studentId) { 
	  this.StudentId = studentId; 
	 } 
	 public String getStudentName() { 
	  return this.StudentName; 
	 } 
	 public void setStudentName(String studentName) { 
	  this.StudentName = studentName; 
	 } 
	 public AddressBean getAddressBean() { 
	  return this.addressBean; 
	 } 
	 public void setAddressBean(AddressBean addressBean) { 
	  this.addressBean = addressBean; 
	 } 
	 
}
