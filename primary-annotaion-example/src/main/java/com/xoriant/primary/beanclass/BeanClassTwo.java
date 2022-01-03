package com.xoriant.primary.beanclass;

import org.springframework.stereotype.Component;

import com.xoriant.primary.beaninterface.BeanInterface;

@Component
public class BeanClassTwo implements BeanInterface{

	@Override
	public void doSomthing() {	
		System.out.println(" >>> In doSomthing BeanTwo class <<< ");
	}
}
