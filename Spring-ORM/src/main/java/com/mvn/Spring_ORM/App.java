package com.mvn.Spring_ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mvn.Spring_ORM.Dao.StudentDao;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        StudentDao sd = (StudentDao) context.getBean("stDao");
        System.out.println(sd.toString());

        // savestudent
//        StudentBean std = new StudentBean();
//        std.setId(7);
//        std.setName("divya");
//        std.setCourse("java");
//        studentDao.savestudent(std);
    }
}

