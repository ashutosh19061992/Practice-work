package com.xoriant.aop.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {

	// * is used for return type from doPayment() method

	@Before("execution(* com.xoriant.aop.payment.Payment.doPayment())" + "\n")
	public void beforeAuthentication() {
		System.out.println("Authentication please wait....!!");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After("execution(* com.xoriant.aop.payment.Payment.doPayment())")
	public void afterTransation() {
		System.out.println("Removed user account details...." + "\n");
	}
}
