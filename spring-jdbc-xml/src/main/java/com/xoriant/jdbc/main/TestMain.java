package com.xoriant.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.jdbc.dao.StudentDao;
import com.xoriant.jdbc.student.Student;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
		StudentDao studetnDao = applicationContext.getBean("studenDao", StudentDao.class);
//		studetnDao.insert(new Student("23456", "Shakal", "89653", "Raja Kishan"));
		
		System.out.println(studetnDao.getAllStudents());
//		studetnDao.delete("123455");
//		studetnDao.delete("123");
//		studetnDao.delete("23456");
	}
}
