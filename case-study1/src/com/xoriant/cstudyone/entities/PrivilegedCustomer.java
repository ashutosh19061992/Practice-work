package com.xoriant.cstudyone.entities;

import java.util.Date;

public class PrivilegedCustomer extends Customer {

	protected Double registrationFees;
	protected Date dateOfRegistration;
	protected double discounts;

	public PrivilegedCustomer(Person person, long customerId, Address address, Date dateOfMemberShip,
			Double regisTrationfees, Date dateOfRegistartion, double discount) {
		
		super(person, customerId, address, dateOfMemberShip);
		this.registrationFees = regisTrationfees;
		this.dateOfRegistration = dateOfRegistartion;
		this.discounts = discount;
	}

	public PrivilegedCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getRegistrationFees() {
		return registrationFees;
	}

	public void setRegistrationFees(Double registrationFees) {
		this.registrationFees = registrationFees;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}

	@Override
	public String toString() {
		return "PrivilegedCustomer [registrationFees=" + registrationFees + ", dateOfRegistration=" + dateOfRegistration
				+ ", discounts=" + discounts + "]";
	}
}
