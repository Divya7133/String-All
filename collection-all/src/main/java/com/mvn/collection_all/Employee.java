package com.mvn.collection_all;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
private List<String>Empname;
private Set<Integer>Empnum;
private Map<String,String>Empdeptno;
private Properties Empsalary;
public Employee(List<String>Empname,Set<Integer>Empnum,Map<String,String>Empdeptno,Properties Empsalary) {
	this.Empname=Empname;
	this.Empnum=Empnum;
	this.Empdeptno=Empdeptno;
	this.Empsalary=Empsalary;
}
 public Employee() {
	 
 }
 public List<String> getEmpName() {
     return this.Empname;
 }

 public void setEmpName(List<String> Empname) {
     this.Empname = Empname;
 }

 public Set<Integer> getEmpNum() {
     return this.Empnum;
 }

 public void setEmpNum(Set<Integer> Empnum) {
     this.Empnum = Empnum;
 }

 public Map<String, String> getEmpDeptNo() {
     return this.Empdeptno;
 }

 public void setEmpDeptNo(Map<String, String> Empdeptno) {
     this.Empdeptno = Empdeptno;
 }

 public Properties getEmpSalary() {
     return this.Empsalary;
 }

 public void setEmpSalary(Properties Empsalary) {
     this.Empsalary = Empsalary;
 }
 public void print() {
	 System.out.println(Empname+","+Empnum+","+Empdeptno+","+Empsalary);
 }
}
 	 
 
 

