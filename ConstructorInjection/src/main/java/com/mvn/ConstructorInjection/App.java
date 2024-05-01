package com.mvn.ConstructorInjection;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        BeanClass bean = (BeanClass) context.getBean("beanId");
        bean.Details();
    }
}
