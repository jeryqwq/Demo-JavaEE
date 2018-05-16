package springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.xiangqin.damao.DaMao;


public class TestIoc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserDao userDao=(UserDao) application.getBean("userDao");
//		userDao.say();
//		ApplicationContext application1 new ClassPathXmlApplicationContext("applicationContext.xml");
		DaMao damao=(DaMao) application.getBean("damao");
		System.out.println(damao.getGrifriend().getHobby());
	}
}
