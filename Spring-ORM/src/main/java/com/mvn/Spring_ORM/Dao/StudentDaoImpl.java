package com.mvn.Spring_ORM.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mvn.Spring_ORM.StudentBean;

public class StudentDaoImpl implements StudentDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public int savestudent(StudentBean studentBean) {
        int savedDetails = (Integer) hibernateTemplate.save(studentBean);
        return savedDetails;
    }

    @Override
    public StudentBean viewstudentone(int id) {
        // Implement logic to retrieve a student by ID
        return null; // Replace with actual implementation
    }

    @Override
    public void updatestudent(StudentBean studentBean) {
        // Implement logic to update a student
    }

    @Override
    public void deletestudent(int id) {
        // Implement logic to delete a student
    }

    @Override
    public List<StudentBean>studentAll() {
        // Implement logic to retrieve all students
        return null; // Replace with actual implementation
    }
}
