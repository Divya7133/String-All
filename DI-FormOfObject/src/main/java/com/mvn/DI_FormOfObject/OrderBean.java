package com.mvn.DI_FormOfObject;

public class OrderBean {
 private int Oid;
 private ProductBean product;
 public OrderBean(int Oid,ProductBean product) {
	 this.Oid=Oid;
	 this.product=product;
 }
 public OrderBean() {
	 
 }
 public void print() {
	 System.out.println(this.Oid);
	 System.out.println(this.product.getpid());
	 System.out.println(this.product.getpname());
	 System.out.println(this.product.getprice());
	 System.out.println(this.product.getquality());
	 
 }
 
 public void setproduct(ProductBean product) {
	 this.product=product;
 }
 public ProductBean getproduct() {
	 return this.product;
 }
}

