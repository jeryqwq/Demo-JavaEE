package com.itheima.istacnce.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bean1.xml");
	Bean1 bean1=(Bean1)applicationContext.getBean("bean1");
	System.out.println(bean1);
}
}
