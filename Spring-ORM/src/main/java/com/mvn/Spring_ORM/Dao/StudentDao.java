package com.mvn.Spring_ORM.Dao;

import java.util.List;

import com.mvn.Spring_ORM.StudentBean;

public interface StudentDao {
public int savestudent(StudentBean StudentBean);
public StudentBean viewstudentone(int id);
public void updatestudent(StudentBean StudentBean);
public void deletestudent(int id);
public List<StudentBean>studentAll();
}
