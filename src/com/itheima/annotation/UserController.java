package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userController")
public class UserController {
@Resource(name="userService")
private UserService userService;
@RequestMapping("save")
public String save(){
	this.userService.save();
	System.out.println("usercongroller ...save....");
	return "success";
}
}
