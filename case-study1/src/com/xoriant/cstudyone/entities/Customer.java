package com.xoriant.cstudyone.entities;
import java.util.Date;

public class Customer {
	private Person person;
	private long customerId;
	private Address address;
	private Date dateOfMemberShip;
	
	public Customer(Person person, long customerId, Address address, Date dateOfMemberShip) {
		super();
		this.person = person;
		this.customerId = customerId;
		this.address = address;
		this.dateOfMemberShip = dateOfMemberShip;
	}

	public Date getDateOfMemberShip() {
		return dateOfMemberShip;
	}

	public void setDateOfMemberShip(Date dateOfMemberShip) {
		this.dateOfMemberShip = dateOfMemberShip;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customers [person=" + person + ", customerId=" + customerId + ", address=" + address + "]";
	}
}
