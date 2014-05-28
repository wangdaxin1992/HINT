package com.norlink.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.norlink.po.Shop;

@Component
public class ShopDAO {

	@Resource
	private HibernateTemplate hibernateTemplate;
	
	
	public void addshop(Shop shop ){
		System.out.println("dao");
		hibernateTemplate.save(shop);
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
