package com.norlink.service;

import java.util.List;

import com.norlink.po.User;

public interface UserService {

	/**�û����service*/
	public void add (User user);
	
	public List<User> list ();
}
