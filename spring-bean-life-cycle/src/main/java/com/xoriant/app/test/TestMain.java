package com.xoriant.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.xoriant.app.configuration.ConfigurationDemo;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
//		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
//		applicationContext.close();
//		applicationContext.registerShutdownHook();
	}
}
