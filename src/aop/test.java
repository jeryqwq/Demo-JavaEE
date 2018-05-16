package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext application=new ClassPathXmlApplicationContext("aop/application.xml");
		UserDao userDao=(UserDao) application.getBean("userDao");
		userDao.addUser();
		
	}

}
