package com.xoriant.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.jdbc.dao.StudentDao;
import com.xoriant.jdbc.datasource.JDBCTemplate;
import com.xoriant.jdbc.entities.Student;

public class TestMain {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
//		JDBCTemplate jdbcTemplate = applicationContext.getBean("template", JDBCTemplate.class);
		
		
		int[] intArray = {1, 2, 3, 4, 6, 8};
		for(int i=1; i<=intArray.length; i++) {
			int lastIndex = (intArray.length/2 )-i;
			int a = intArray[lastIndex];
			int b = intArray[i];
			System.out.println(a +" : " + b);
//			System.out.println(intArray[i]);

		}
	}
}
