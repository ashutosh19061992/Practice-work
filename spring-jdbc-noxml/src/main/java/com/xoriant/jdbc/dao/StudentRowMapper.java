package com.xoriant.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.xoriant.jdbc.entities.Student;

public class StudentRowMapper implements RowMapper<Student> {
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getString(1));
		student.setAddress(rs.getString("address"));
		student.setName(rs.getString("name"));
		student.setRollNo(rs.getString("rollNo"));
		return student;
	}
}
