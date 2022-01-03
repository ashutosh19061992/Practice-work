package com.xoriant.refference.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.reffernce.service.Employee;

public class TestMain {

	public static void main(String[] args) {

//		/**** Using Refference ****/
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
		Employee employee = applicationContext.getBean("emp_ref", Employee.class);
		employee.display();
	}
}
