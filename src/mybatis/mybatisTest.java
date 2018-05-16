package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class mybatisTest {
@Test
	public void findById () throws IOException {
	InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession=sqlSessionFactory.openSession();
	Customer customer=sqlSession.selectOne("mybatis.CustomerMapper.findCustomerById", 1);
	System.out.println(customer);
	sqlSession.close();
}
//@Test
//public void addCustomer () throws IOException {
//	String path="mybatis-config.xml";
//InputStream inputStream=Resources.getResourceAsStream(path);
//SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//SqlSession sqlSession=sqlSessionFactory.openSession();
//Customer customer=new Customer();
//customer.setJobs("programmer");
//customer.setPhone("137994545");
//customer.setUsername("cj");
//int rows=sqlSession.insert("mybatis.CustomerMapper.addCustomer",customer );
//System.out.println(rows);
//sqlSession.commit();
//sqlSession.close();
//}
}
