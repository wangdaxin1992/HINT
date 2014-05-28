package com.norlink.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.norlink.service.ShopService;

@Controller
@RequestMapping("/add.do")
public class ShopController {

	@Resource
	private ShopService shopservice;

	@RequestMapping(params = "method=reg2")
	public String add() {
		System.out.println("add.do½øÀ´ÁË");
		shopservice.add("e://shop.xls");
		return "index";
	}

	public ShopService getShopservice() {
		return shopservice;
	}

	public void setShopservice(ShopService shopservice) {
		this.shopservice = shopservice;
	}

}
