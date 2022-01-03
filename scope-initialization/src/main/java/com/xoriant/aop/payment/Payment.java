package com.xoriant.aop.payment;

public class Payment {

	public void doPayment() {

		/**
		 * TODO: Need to create a security feature befor we do any account related
		 * activity.
		 */
		
		System.out.println("Amount debited, now your account balance is:  12000/-" + "\n");
		System.out.println("Amount credited, now your account balance is:  15000/-");
	}
}
