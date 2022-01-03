package com.xoriant.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.aop.payment.Payment;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

		Payment payment = applicationContext.getBean("payment", Payment.class);
		payment.doPayment();
	}
}
