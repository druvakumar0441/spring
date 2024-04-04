package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class stdService {


	@Autowired
	private stdDao dao;
	
	public void save(student s) {
		System.out.println("from service class===" +s);
		dao.save(s);
	}
}
