package com.xoriant.jdbc.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component("template")
public class JDBCTemplate {
	@Bean 
	public DriverManagerDataSource getDataSource() {
		System.out.println("in bean datasource..");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setPassword("12345678");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJDBCTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
