package com.norlink.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.norlink.po.User;
import com.norlink.service.UserServiceImpl;

@Controller
public class ajaxController {
	/**
	 * ajax≤‚ ‘ http://127.0.0.1/HINT/ajax
	 */
	@Resource
	private UserServiceImpl userservice;

	@RequestMapping("/ajax.do")
	public void ajax(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Ω¯¿¥¡À");
		List<User> user = userservice.list();
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("password"));
		for(User use: user){
			System.out.println(use.getId());
		}
	}

	public UserServiceImpl getUserservice() {
		return userservice;
	}

	public void setUserservice(UserServiceImpl userservice) {
		this.userservice = userservice;
	}
	
}
