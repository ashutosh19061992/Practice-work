package com.xoriant.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.xoriant.jdbc.student.Student;

public class ResultsetExtractorImpl implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		System.out.println(" >>>> In ResultSet Extractor <<<<< ");
		List<Student> studentList = new ArrayList<Student>();
		
		while (rs.next()) {
			Student student = new Student();
			student.setId(rs.getString(1));
			student.setAddress(rs.getString("address"));
			student.setName(rs.getString("name"));
			student.setRollNo(rs.getString("rollNo"));
			studentList.add(student);
		}
		return studentList;
	}
}
