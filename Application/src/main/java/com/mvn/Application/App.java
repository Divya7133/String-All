package com.mvn.Application;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathResource res=new ClassPathResource("SpringConfig.xml");
       XmlBeanFactory factory = new XmlBeanFactory(res);
       BeanClass myBean =(BeanClass) factory.getBean("add");
       myBean.printAddition();
    }
}
