package com.xoriant.autowiring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.autowiring.service.Employee;

public class TestMain {

	public static void main(String[] args) {

//		/**** Using Autowiring ****/
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
		Employee employee = applicationContext.getBean("emp", Employee.class);
		employee.display();
	}
}
