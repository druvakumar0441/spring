package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class stdController {

	@Autowired
	private stdService service;
	

	public void save(student c) {
		System.out.println("from controller class===" +c);
		service.save(c);
	}
}
