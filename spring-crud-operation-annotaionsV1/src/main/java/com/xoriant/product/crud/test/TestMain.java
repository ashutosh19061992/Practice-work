package com.xoriant.product.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.product.crud.models.Product;
import com.xoriant.product.crud.service.ProductService;

public class TestMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
		ProductService productService = applicationContext.getBean("service", ProductService.class);

		productService.add(new Product());
		productService.delete("123");
		productService.getAllProducts();
		productService.getProduct("123");
	}

}
