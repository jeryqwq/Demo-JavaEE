package com.usermgr.service;

import com.usermgr.model.User;

public interface UserService {

	public User getUserByLoginNameAndPwd(String loginName,String password);
}
