package com.mvn.DI_FormOfObject;

public class ProductBean {
private int pid;
private String pname;
private double price;
private String quality;
public ProductBean(int pid,String pname,double price,String quality) {
	this.pid=pid;
	this.pname=pname;
	this.price=price;
	this.quality=quality;
}
public ProductBean() {
	
}
public void setpid(int pid) {
	this.pid=pid;
}
public void setpname(String pname) {
	this.pname=pname;
}
public void setprice(double price) {
	this.price=price;
}
public void setquality(String quality) {
	this.quality=quality;	
}
public int getpid() {
	return this.pid;
}
public String getpname() {
	return this.pname;
}
public double getprice() {
	return this.price;
}
public  String getquality() {
	return this.quality;
}

}

