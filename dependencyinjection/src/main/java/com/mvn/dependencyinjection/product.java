package com.mvn.dependencyinjection;

public class product {
	private int productId;
	private String pname;
	private double price;
	private int quantity;

	public product(int productId, String name, double price, int quantity) {
		this.productId = productId;
		this.pname = name;
		this.price = price;
		this.quantity = quantity;

	}
	public product() {
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
