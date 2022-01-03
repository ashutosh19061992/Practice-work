package com.xoriant.aop.payment;

public class Payment {

	// join point -> issues, related code
	public void doPayment() {

		/**
		 * TODO: Need to create a security feature befor we do any account related
		 * activity.
		 */
		System.out.println("Amount debited, now your account balance is:  12000/-" + "\n");
		System.out.println("Amount credited, now your account balance is:  15000/-");
	}

	// aspect -> solution to a join point, or code that needs to be inserted into
	// join point.
	public boolean authenticateUser() {
		//action taken by an aspect to resolve issue of join point.
		return true;
	}
	
	
}
