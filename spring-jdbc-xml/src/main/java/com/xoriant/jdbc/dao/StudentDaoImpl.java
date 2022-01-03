package com.xoriant.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.xoriant.jdbc.student.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

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
}
