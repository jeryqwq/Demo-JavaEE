package com.itheima.istacnce.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean3.xml");
	System.out.println(applicationContext.getBean("bean3"));
}
}
