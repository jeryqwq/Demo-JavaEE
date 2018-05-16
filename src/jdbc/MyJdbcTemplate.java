package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyJdbcTemplate {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("jdbc/application.xml");
	org.springframework.jdbc.core.JdbcTemplate jdbcTemplateTest=(org.springframework.jdbc.core.JdbcTemplate)applicationContext.getBean("jdbcTemplate");
	jdbcTemplateTest.execute("create table customer("+
	"id int primary key auto_increment,"+
			"username varchar(50),"+
	"jobs varchar(50),"
	+ "phone varchar(20))"
			);
	System.out.println("success to create table");
}
}
