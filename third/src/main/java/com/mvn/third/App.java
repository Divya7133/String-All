package com.mvn.third;

import com.mvn.third.interfacee.studentimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//student s=new student(101,"divya","java");
    	studentimple s=new studentimple(101,"divya","java");
    	System.out.println(s.getRollnum());
    	System.out.println(s.getName());
    	System.out.println(s.getCourse());
    	s.setRollnum(101);
    	s.setName("reddy");
    	s.setCourse("react");
    	System.out.println(s.getRollnum());
    	System.out.println(s.getName());
    	System.out.println(s.getCourse());
    }
}
