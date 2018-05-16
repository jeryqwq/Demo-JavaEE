package com.usermgr.dao;

import com.usermgr.model.User;

public interface UserDao {

	public User getUserByLoginNameAndPwd(String loginName, String password);



}
