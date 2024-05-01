package com.mvn.dependencyinjection;

public class order {
private int orderId;
private String name;
private product prod;
public order(int Id,String name,product prod) {
	this.orderId=orderId;
	this.name=name;
	this.prod=prod;
	
	  }
public order() {
	
}
void print() {
	System.out.println(this.orderId);
	System.out.println(this.name);
	System.out.println(this.prod.getProductId());
	System.out.println(this.prod.getPname());
	System.out.println(this.prod.getPrice());
	System.out.println(this.prod.getQuantity());
}

public void setproduct(product prod) {
	this.prod=prod;
}
public product getproduct() {
	return this.prod;
}
    }

