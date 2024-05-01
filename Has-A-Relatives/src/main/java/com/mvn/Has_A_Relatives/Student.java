package com.mvn.Has_A_Relatives;

public class Student {
private String studentname;
private String sclass;
private Marks marks;
public Student(String studentname,String sclass,Marks marks) {
	this.studentname=studentname;
	this.sclass=sclass;
	this.marks=marks;
}
public Student() {
	
}
void print() {
    System.out.println(this.studentname);
    System.out.println(this.sclass);
    System.out.println(this.marks.getpps());
    System.out.println(this.marks.getjava());
    System.out.println(this.marks.getpython());
    }
public void setStudentname(String studentname) {
	this.studentname=studentname;
}
public void setSclass(String sclass) {
	this.sclass=sclass;
}
public void setMarks(Marks marks) {
	this.marks=marks;
}
public String getstudentname() {
	return this.studentname;
}
public String getSclass() {
	return this.sclass;
}
public Marks getMarks() {
	return this.marks;
   }
}
