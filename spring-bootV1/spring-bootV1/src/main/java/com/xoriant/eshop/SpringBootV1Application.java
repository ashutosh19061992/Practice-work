package com.xoriant.eshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.xoriant.eshop.service.ProductReviewService;
import com.xoriant.eshop.service.ProductReviewServiceImpl;
import com.xoriant.eshop.service.ProductService;
import com.xoriant.eshop.service.ProductServiceImpl;

@SpringBootApplication
public class SpringBootV1Application{

	@Autowired
	ProductService productService;
	
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootV1Application.class, args);
		ProductService ps = applicationContext.getBean(ProductServiceImpl.class);

		ProductReviewService pr = applicationContext.getBean(ProductReviewServiceImpl.class);

		pr.saveProductReview();
		ps.saveProduct();
	}

}
