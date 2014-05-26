package com.norlink.service;

import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.norlink.dao.UserDAO;
import com.norlink.po.User;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDAO userdao;
	
	public void add(User user) {
		user.setStartdate(new Date(System.currentTimeMillis()));
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getStartdate());
		userdao.add(user);
	}

	public UserDAO getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}

	
}
