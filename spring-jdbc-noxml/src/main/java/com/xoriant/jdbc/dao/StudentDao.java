package com.xoriant.jdbc.dao;

import java.util.List;

import com.xoriant.jdbc.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int updateStudent(Student student);
	
	public int delete(String studentId);
	
	public List<Student> getAllStudents();
}
