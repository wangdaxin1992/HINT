package com.norlink.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.norlink.po.User;
import com.norlink.service.UserServiceImpl;

@Controller
@RequestMapping("/user.do")
@SessionAttributes({"wangdaxin","ok"})
public class UserController {

	@Resource 
	private UserServiceImpl userservice;
	
	@RequestMapping(params="method=reg")
	public String add(User user){
		userservice.add(user);
		return  "index";
	}

	public UserServiceImpl getUserservice() {
		return userservice;
	}

	public void setUserservice(UserServiceImpl userservice) {
		this.userservice = userservice;
	}
	
}
