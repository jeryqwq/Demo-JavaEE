package com.usermgr.service.impl;

import com.usermgr.dao.UserDao;
import com.usermgr.dao.impl.UserDaoImpl;
import com.usermgr.model.User;
import com.usermgr.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao=new UserDaoImpl();
	public User  getUserByLoginNameAndPwd(String loginName,String password){
		for (User user  : UserDaoImpl.userList) {
			if(user.getUsername().equals(loginName)&&user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
}
}
