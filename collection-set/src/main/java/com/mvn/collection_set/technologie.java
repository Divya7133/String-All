package com.mvn.collection_set;

import java.util.Set;

public class technologie {
private Set<Integer>studentRollnumber;
public technologie(Set<Integer>studentRollnumber) {
	this.studentRollnumber=studentRollnumber;
}
public technologie() {
	
}
public void setStudentRollnumber(Set<Integer>studentRollnumber ){
	this.studentRollnumber=studentRollnumber;
}
public Set<Integer> getStudentRollnumber(){
	return this.studentRollnumber;
}
public void print() {
	System.out.println(studentRollnumber);
}
}
