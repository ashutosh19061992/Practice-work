package com.xoriant.product.crud.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.xoriant.product.crud.configuration.ApplicationConfiguration;
import com.xoriant.product.crud.models.Product;
import com.xoriant.product.crud.service.ProductService;

public class TestMain {

	public static void main(String[] args) {
		// providing the configuration to spring container using confugration class.
		AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);
		
		// getting the productService object
		ProductService productService = abstractApplicationContext.getBean("product-service", ProductService.class);
		productService.add(new Product());
		productService.delete("123");
		abstractApplicationContext.close();
	}

}
