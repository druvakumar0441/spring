package com.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class JDBCUtility {

	@Bean
	public DataSource datasouce() {
		BasicDataSource bd = new BasicDataSource();
		bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bd.setUrl("jdbc:mysql://localhost:3306/spring");
		bd.setUsername("root");
		bd.setPassword("root");
		return bd;
		
	}
}
