package com.xoriant.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.aop.payment.Payment;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Payment bean = applicationContext.getBean("payment", Payment.class);
		bean.doPayment();
		
	}
}
