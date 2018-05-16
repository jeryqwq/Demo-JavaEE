package com.itheima.istacnce.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bean2.xml");
	//Bean1 bean2=(Bean2)applicationContext.getBean("bean2");
	System.out.println(applicationContext.getBean("bean2"));
}
}
