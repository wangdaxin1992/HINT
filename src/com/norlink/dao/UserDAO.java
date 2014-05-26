package com.norlink.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.norlink.po.User;

@Component
public class UserDAO {

	@Resource
	private HibernateTemplate hibernateTemplate;
	
	/**
	 * ×¢²áÓÃ»§
	 * @param user
	 */
	public void add (User user){
		hibernateTemplate.save(user);
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
