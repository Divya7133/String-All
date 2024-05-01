package com.mvn.Autowiring;

public class SecondBean {
	private int id;
	private String name; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("this is setters");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public SecondBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public SecondBean() {
		super();
		
	}
	
	
}
