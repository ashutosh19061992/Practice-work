package com.xoriant.primary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.xoriant.primary.service.BeanService;

@Controller
public class CommantLineController implements CommandLineRunner{

	@Autowired
	private BeanService beanService; 
	
	@Override
	public void run(String... args) throws Exception {
		callThisMethod();
	}

	
	private void callThisMethod() {
		this.beanService.beanServiceMethod();
	}
	
}
