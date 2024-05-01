package com.mvn.DependencyInjectionObject;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");       
        StudentBean studBean = (StudentBean) context.getBean("student");
        studBean.print(); 
    }
}
