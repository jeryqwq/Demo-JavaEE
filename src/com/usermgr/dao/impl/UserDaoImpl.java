package com.usermgr.dao.impl;

import java.util.ArrayList;

import com.usermgr.dao.UserDao;
import com.usermgr.model.User;

public class UserDaoImpl implements UserDao{ 
	public static ArrayList<User> userList=new ArrayList<User>();
static{ 
	User user=new User("Full-Stack","node","node");
	userList.add(user);
	user=new User("FrontEnd","123","cj");
	userList.add(user);
	user=new User("BackEnd","123","cjj");
	userList.add(user);
} 
	public User getUserByLoginNameAndPwd(String loginName,String password) {
		for (User user  : userList) {
			if(user.getUsername().equals(loginName)&&user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}


}
