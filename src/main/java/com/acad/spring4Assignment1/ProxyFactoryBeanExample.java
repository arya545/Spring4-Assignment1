package com.acad.spring4Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext cx=new ClassPathXmlApplicationContext("ProxyFactoryBeanContext.xml");
    MyBean bean1=(MyBean) cx.getBean("myBean1");
    MyBean bean2=(MyBean)cx.getBean("myBean2");
    
    System.out.println("Bean 1");
    bean1.execute();
    
    System.out.println("\nBean 2");
    bean2.execute();
	}

}
