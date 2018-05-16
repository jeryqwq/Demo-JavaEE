package com.usermgr.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.usermgr.dao.impl.UserDaoImpl;
import com.usermgr.model.User;

@Controller
public class UserController {
@RequestMapping(value="/login")
public String login(@RequestParam("loginname") String loginname,@RequestParam("password") String password,Model model){
	if(loginname.equals("")||loginname==null||password.equals("")||password==null){
		return "loginform";
	}
	User user=new User();
	UserDaoImpl uDaoImpl=new UserDaoImpl();
	if((user=uDaoImpl.getUserByLoginNameAndPwd(loginname, password))!=null){
		model.addAttribute("user",user);
		return "welcome";
	}
	return "error";
}
@RequestMapping(value="/register")
public String register(User user,Model model){
	UserDaoImpl.userList.add(user);
	System.out.println(user.getUsername()+user.getPassword()+user.getLoginname());
	
	model.addAttribute("user",user);
	return "welcome";
}
@RequestMapping(value="deleteUser")
public String deleteUser(Integer[] likes,Model model){
	for (Integer integer : likes) {
		System.out.println(integer);
	}
	return "success";
}
@RequestMapping("toDate")
public String toDate(Date date){
	
	System.out.println(date.getClass());
	System.out.println("date="+date);
	return "success";
}

}
