package jdbc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Junit {

	@Test
	public void test() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("jdbc/application.xml");
AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");
Account account=new Account("Cj",25.6);
int num=accountDao.addAccount(account);
		System.out.println(num);
	}

}
