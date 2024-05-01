package com.mvn.Spring_JDBC_1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeBean {
    private int empId;
    private String empName;
    private double empSalary;
    private int deptNo;
    private JdbcTemplate jt;


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    
    public int getEmpId() {
        return this.empId;
    }

    
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return this.empName;
    }

    
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

   
    public double getEmpSalary() {
        return this.empSalary;
    }

    
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    
    public int getDeptNo() {
        return this.deptNo;
    }

    
    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }
    public JdbcTemplate getJt() {
        return this.jt;
    }
    public void create() {
        jt.execute("create table Emplo(empId int,empName varchar(20),empSalary int,deptNo int)");
        System.out.println("Table created");
    }

    public void update() {
        int up = jt.update("update Emp set name='divya' where id='101'");
        System.out.println("Emp updated");
    }

    public void delete() {
        int delete = jt.update("delete from Emp where id='101'");
        System.out.println("Emp deleted");
    }
    public void getoneRecord() {
    	List<Map<String,Object>>oneRecord=jt.queryForList("select*from Emp where id=101");
    	Iterator it = oneRecord.iterator();
    		while(it.hasNext());
    		Object obj=it.next();
    		System.out.println(obj.toString());
    }
    
}
