package com.xoriant.primary.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.xoriant.primary.beanclass.BeanClassOne;
import com.xoriant.primary.beanclass.BeanClassTwo;
import com.xoriant.primary.beaninterface.BeanInterface;

@Configuration
public class BeanConfiguration {
	
	@Bean("BeanClassOne")
	public BeanInterface beanClassOne() {
		return new BeanClassOne();
	}
	
	@Bean("BeanClassTwo")
	@Primary
	public BeanInterface beanClassTwo() {
		return new BeanClassTwo();
	}
}
