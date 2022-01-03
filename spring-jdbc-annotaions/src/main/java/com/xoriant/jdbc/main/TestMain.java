package com.xoriant.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoriant.jdbc.configuration.ApplicationConfiguration;
import com.xoriant.jdbc.dao.StudentDao;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		StudentDao studetnDao = applicationContext.getBean("studenDao", StudentDao.class);

//		// row mapper call
		studetnDao.getAllStudents().forEach(stud -> {
			System.out.println(stud);
		});
		// rowcallback -----> everytime method gets executed
//		studetnDao.generateAllStudentsReport();
		
//		//ResultSetExtractor--- > all query in one go
//		studetnDao.extractStudentdata().forEach(stud -> {
//			System.out.println(stud);
//		});
	}
}
