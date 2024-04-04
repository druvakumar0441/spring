package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		sc.save(new student(2, "hari", 23, "mtech"));
	}
}
