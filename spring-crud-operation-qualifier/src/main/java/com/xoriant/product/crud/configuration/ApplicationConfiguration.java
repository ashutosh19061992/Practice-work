package com.xoriant.product.crud.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.xoriant.product.crud.dao, com.xoriant.product.crud.service")
@ComponentScans(value = { @ComponentScan("com.xoriant.product.crud.dao"),
		@ComponentScan("com.xoriant.product.crud.service") })
public class ApplicationConfiguration {

	public ApplicationConfiguration() {
		System.out.println(">>> Application configuration created >>> ");
	}
}
