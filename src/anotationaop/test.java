package anotationaop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext application=new ClassPathXmlApplicationContext("anotationaop/application.xml");
	UserDao userDao=(UserDao) application.getBean("UserDaoImpl");
	userDao.addUser();
}
}
