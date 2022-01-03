package com.xoriant.jdbc;

import com.mysql.jdbc.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class JDBCConnect {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());

		} catch (SQLException e) {
			System.out.println("Something went wrong " + e.getMessage());
		}
		String databaseName = "test";
		String url = "jbdc:mysql://localhost:3306/" + databaseName;
		String userName = "admin";
		String password = "123456789";

		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			if (connection != null) {
				System.out.println("Connected to database...");
				Statement statement = connection.createStatement();
				ResultSet queryResult = statement.executeQuery("Select * from product");
				while (queryResult.next()) {

				}
			} else {
				System.out.println("Unable to connect to db...");
			}

		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

	}
}
