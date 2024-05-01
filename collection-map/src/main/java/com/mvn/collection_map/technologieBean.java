package com.mvn.collection_map;

import java.util.Map;

public class technologieBean {
private Map<String,String>studentcourse;
public technologieBean(Map<String,String>studentcourse) {
	this.studentcourse=studentcourse;
}
public technologieBean() {
	
}
public void setStudentcourse(Map<String,String>studentcourse ){
	this.studentcourse=studentcourse;
}
public Map<String,String> getStudentcourse(){
	return this.studentcourse;
}
public void printcourse() {
	for(Map.Entry<String,String>entry:studentcourse.entrySet()) {
		

	System.out.println(entry.getKey()+":"+entry.getValue());
     }
   }

 }