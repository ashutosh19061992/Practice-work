package com.kiosk.application.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String customerId;
	private Person personCustomer;
	private Address shippingAddress;
	private static List<Order> ordersList = new ArrayList<Order>();
	private static List<Order> processedOrder = new ArrayList<Order>();

	public Customer() {
		super();
	}

	public Customer(String customerId, Person personCustomer, Address shippingAddress) {
		super();
		this.customerId = customerId;
		this.personCustomer = personCustomer;
		this.shippingAddress = shippingAddress;
	}

	public static List<Order> getProcessedOrder() {
		return processedOrder;
	}

	public boolean setProcessedOrder(Order processedOrder) {
		return Customer.processedOrder.add(processedOrder);
	}

	public String getCustomerId() {
		return customerId;
	}

	public List<Order> getOrdersList() {
		return ordersList;
	}

	public boolean addOrders(Order orderDetails) {
		return ordersList.add(orderDetails);
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Person getPersonCustomer() {
		return this.personCustomer;
	}

	public void setPersonCustomer(Person personCustomer) {
		this.personCustomer = personCustomer;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", personCustomer=" + personCustomer + ", shippingAddress="
				+ shippingAddress + "]";
	}
}
