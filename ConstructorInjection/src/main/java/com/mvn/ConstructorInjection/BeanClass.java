package com.mvn.ConstructorInjection;

public class BeanClass {
    private int id;
    private String name;
    private String course;
    private int batch;
    private String location;

    public BeanClass(int id, String name, String course, int batch, String location) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.batch = batch;
        this.location = location;
    }
    public BeanClass() {
    	
    }
    public void Details() {
    	System.out.println(this.id);
    	System.out.println(this.name);
    	System.out.println(this.course);
    	System.out.println(this.batch);
    	System.out.println(this.location);
    	
    }
    public void setid(int id) {
    	this.id=id;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public void setcourse(String course) {
    	this.course=course;
    }
    public void setbatch(int batch) {
    	this.batch=batch;
    }
    public void setlocation(String location) {
    	this.location=location;
    }
    public int getid() {
    	return this.id;
    }
    public String getname() {
    	return this.name;
    }
    public String getcourse() {
    	return this.course;
    }
    public int getbatch () {
    	return this.batch;
    }
    public String getLocation() {
    	return this.location;
    }
}
