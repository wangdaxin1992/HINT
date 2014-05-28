package com.norlink.service;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.annotation.Resource;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.springframework.stereotype.Service;

import com.norlink.dao.ShopDAO;
import com.norlink.po.Shop;

@Service
public class ShopServiceImpl implements ShopService {

	@Resource
	private ShopDAO shopdao;

	public void add(String address) {
		String fileName = address;
		InputStream is = null;
		FileInputStream fn = null;
		int cs = 0;
		int rs = 0;
		try {
			fn = new FileInputStream(fileName);
			is = fn;
			Workbook rb = Workbook.getWorkbook(is);
			Sheet s = rb.getSheet(0);// 此处只读取第一个sheet内容
			cs = s.getColumns();
			rs = s.getRows();
			for (int j = 1; j < rs; j++) {
				Cell[] c = s.getRow(j);
				Shop shop = new Shop();
				for (int x = 1; x < c.length; x++) { // 横行输出
					shop.setProvinces(c[x].getContents());
					++x;
					shop.setCity(c[x].getContents());
					++x;
					shop.setShopname(c[x].getContents());
					++x;
					shop.setShopcode(c[x].getContents());
					++x;
					shop.setIp(c[x].getContents());
					x = c.length;
					shopdao.addshop(shop);
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				fn.close();
				is.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

	public ShopDAO getShopdao() {
		return shopdao;
	}

	public void setShopdao(ShopDAO shopdao) {
		this.shopdao = shopdao;
	}

}
