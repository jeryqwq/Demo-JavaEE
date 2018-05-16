package anotationaop;

import org.springframework.stereotype.Repository;

@Repository("UserDaoImpl")
public class UserDaoImpl implements UserDao {

	public void addUser() {
		System.out.println("anotation Aop Add User ing.....");
			
		}

			public void delUser() {
				System.out.println("del User ing....");
			}


}
