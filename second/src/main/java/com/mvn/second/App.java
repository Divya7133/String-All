package com.mvn.second;

import com.mvn.second.interfacee.employeeimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*employee emp=new employee("divya",101,10000);
    	emp.setName("ammu");
    	emp.setAge(22);
    	emp.setSalary(20000);
        System.out.println( emp.getName());
        System.out.println( emp.getAge());
        System.out.println( emp.getSalary());*/
    	employeeimple e=new employeeimple("ammu",22,30000);
    	System.out.println(e.getName());
    	System.out.println(e.getAge());
    	e.setName("divya");
    	System.out.println(e.getName());
    }
}
