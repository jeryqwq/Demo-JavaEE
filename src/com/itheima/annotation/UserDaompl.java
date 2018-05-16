package com.itheima.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaompl implements UserDao {

	public void save() {
		// TODO Auto-generated method stub
		System.out.println(" userdao...save ...");
	}

}
