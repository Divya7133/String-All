package com.mvn.DI_FormOfObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        OrderBean b = (OrderBean) context.getBean("order");
        b.print();
    }
}

