package com.xoriant.jdbc.dao;

import java.util.List;

import com.xoriant.jdbc.student.Student;

public interface StudentDao {

	public int insert(Student student);

	public int updateStudent(Student student);

	public int delete(String studentId);

	public List<Student> getAllStudents();

	public void generateAllStudentsReport();

	public List<Student> extractStudentdata();
}
