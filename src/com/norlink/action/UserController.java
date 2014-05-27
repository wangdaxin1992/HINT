package com.norlink.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	private List<User> userlist ;
	
	@RequestMapping(params="method=reg")
	public String add(User user){
		userservice.add(user);
		return  "index";
	}
	
	@RequestMapping(params="method=reg2")
	public String list(HttpServletRequest request){
		userlist = userservice.list();
		for (User user : userlist){
			System.out.println(user.getName());
			System.out.println(user.getStartdate());
		}
		request.setAttribute("userList", userservice.list());
		return  "index";
	}

	
	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public UserServiceImpl getUserservice() {
		return userservice;
	}

	public void setUserservice(UserServiceImpl userservice) {
		this.userservice = userservice;
	}

	
}
