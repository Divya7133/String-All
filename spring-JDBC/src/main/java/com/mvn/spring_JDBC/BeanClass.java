package com.mvn.spring_JDBC;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class BeanClass {
    private JdbcTemplate Jt;

    // Setter for JdbcTemplate
    public void setJt(JdbcTemplate jt) {
        this.Jt = jt;
    }

    // Getter for JdbcTemplate
    public JdbcTemplate getJt() {
        return this.Jt;
    }

    public BeanClass() {
        super();
    }

    public BeanClass(JdbcTemplate Jt) {
        super();
        this.Jt = Jt;
    }

    public void create() {
        Jt.execute("create table student(id number,name varchar(20),course varchar(10))");
        System.out.println("Table created");
    }

    public void update() {
        int up = Jt.update("update student set name='divya' where id='101'");
        System.out.println("Student updated");
    }

    public void delete() {
        int delete = Jt.update("delete from student where id='101'");
        System.out.println("Student deleted");
    }
    public void getoneRecord() {
    	List<Map<String,Object>>oneRecord=Jt.queryForList("select*from student where id=101");
    	Iterator it = oneRecord.iterator();
    		while(it.hasNext());
    		Object obj=it.next();
    		System.out.println(obj.toString());
    }
    
}
