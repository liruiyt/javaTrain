package cn.web.test;

import cn.web.model.*;
import cn.web.dao.*;

public class test {
	
	public static void main(String[] args) {
		
//		ProductDaoImpl daoImpl = new ProductDaoImpl();
//		Product product = new Product();
//		product.setName("华为手机");
//		product.setPrice(5999.99);
//		product.setRemark("测试增加记录!!");
//		System.out.println(daoImpl.save(product));
		
//		ProductDaoImpl daoImpl = new ProductDaoImpl();
//		Product product = new Product();
//		product.setName("华为手机");
//		product.setPrice(5999.99);
//		product.setRemark("测试修改!!");
//		product.setId(4);
//		System.out.println(daoImpl.update(product));
		
		ProductDaoImpl daoImpl = new ProductDaoImpl();
		System.out.println(daoImpl.delete(5));
	}
	
}
