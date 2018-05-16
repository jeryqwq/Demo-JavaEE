package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceimpl implements UserService {
@Resource(name="userDao")
	private UserDao userDao;
	public void save() {
		// TODO Auto-generated method stub
this.userDao.save();
	System.out.println("UserService...save...");
	}

}
