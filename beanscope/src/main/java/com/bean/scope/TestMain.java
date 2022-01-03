package com.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_config.xml");

		Employee employeeOne = applicationContext.getBean("e1", Employee.class);
		Employee employeeTwo = applicationContext.getBean("e1", Employee.class);
		
//		employeeOne.setName("Ashutosh");
//		employeeOne.display();
//		employeeTwo.display();
		
		
		System.out.println(employeeOne.hashCode());
		System.out.println(employeeTwo.hashCode());
	}
}
