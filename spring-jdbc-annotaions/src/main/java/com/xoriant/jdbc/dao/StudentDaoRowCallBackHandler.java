package com.xoriant.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class StudentDaoRowCallBackHandler implements RowCallbackHandler {

	public void processRow(ResultSet rs) throws SQLException {
		System.out.println(" >>>> In RowCallbackHandler <<<<< ");
		System.out.println("Id: " + rs.getString("id"));
		System.out.println("Name: " + rs.getString("name"));
		System.out.println("RollNo: " + rs.getString("rollNo"));
		System.out.println("Address: " + rs.getString("address"));
		System.out.println("--------------------------------------");
	}
}
