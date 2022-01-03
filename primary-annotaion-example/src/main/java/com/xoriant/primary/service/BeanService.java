package com.xoriant.primary.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.xoriant.primary.beaninterface.BeanInterface;

@Service
public class BeanService {

	@Autowired
//	@Qualifier("BeanClassOne")
	private BeanInterface  beanInterface;
	
	
	public void beanServiceMethod() {
		this.beanInterface.doSomthing();
	}
}
