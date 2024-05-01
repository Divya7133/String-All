package com.mvn.Spring_JDBC_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resourse")
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        EmployeeBean b = (EmployeeBean) context.getBean("empBean"); 
        b.create();
    }
}