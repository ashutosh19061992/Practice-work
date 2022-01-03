package com.xoriant.jdbc.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScans(value = { @ComponentScan("com.xoriant.jdbc.dao") })
@PropertySource(value = "application.properties")
public class ApplicationConfiguration {

	@Autowired
	private Environment env;

	
	
	@Bean
	public DriverManagerDataSource getJdbcDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db-driver"));
		dataSource.setUsername(env.getProperty("db-user"));
		dataSource.setUrl(env.getProperty("db-url"));
		dataSource.setPassword(env.getProperty("db-password"));
		return dataSource;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getJdbcDataSource());
		return jdbcTemplate;
	}
}
