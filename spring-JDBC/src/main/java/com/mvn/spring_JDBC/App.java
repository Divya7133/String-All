package com.mvn.spring_JDBC;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        BeanClass b = (BeanClass) context.getBean("Jdbc");  
    }
}
