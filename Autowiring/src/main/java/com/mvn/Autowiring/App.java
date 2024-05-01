package com.mvn.Autowiring;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("Springconfig.xml");
        FirstBean f=(FirstBean)context.getBean("a");
        
        f.print();
           }
}