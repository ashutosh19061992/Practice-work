package com.xoriant.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xoriant.jdbc.student.Student;

@Component("studenDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "Insert into students(id, name, rollNo, address) values(?, ?, ?, ?)";
		int rows = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getRollNo(),
				student.getAddress());
		System.out.println(+rows + " no of record interted");
		return rows;
	}

	public int updateStudent(Student student) {
		String query = "update students set name=?, rollNo=?, address=? where id=?";
		int updatedRow = this.jdbcTemplate.update(query, student.getName(), student.getRollNo(), student.getAddress(),
				student.getId());
		return updatedRow;
	}

	public int delete(String studentId) {
		String deleteQuery = "delete from students where id=?";
		return this.jdbcTemplate.update(deleteQuery, studentId);
	}

	public List<Student> getAllStudents() {
		String query = "select * from students";
		List<Student> studentList = this.jdbcTemplate.query(query, new StudentRowMapper());
		return studentList;
	}

	// uses row callback handler
	public void generateAllStudentsReport() {
		String query = "select * from students";
		this.jdbcTemplate.query(query, new StudentDaoRowCallBackHandler());
	}

	public List<Student> extractStudentdata() {
		return this.jdbcTemplate.query("select * from students", new ResultsetExtractorImpl());
	}
}
