package com.mvn.Spring_ORM;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentBean {
@Id
private int id;
private String name;
private String course;
public StudentBean() {
	
}
public StudentBean(int id,String name, String course) {
	this.id=id;
	this.name=name;
	this.course=course;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String toString() {
	return (id+","+name+","+course);
}

}
