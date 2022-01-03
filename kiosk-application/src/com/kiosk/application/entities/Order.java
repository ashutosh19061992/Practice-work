package com.kiosk.application.entities;

import com.kiosk.application.entities.computer.Computer;

public class Order {
	private String orderId;
	private Customer customer;
	private Computer computer;
	private ORDERSTATUS orderStatus;

	public enum ORDERSTATUS {
		PENDING, DELIVERED
	}

	public Order(String string, Customer customer, Computer computer) {
		super();
		this.orderId = string;
		this.customer = customer;
		this.computer = computer;
		this.orderStatus = ORDERSTATUS.PENDING;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public ORDERSTATUS getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(ORDERSTATUS orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "" + (orderId != null ? "orderId=" + orderId + ", " : "") + "\n"
				+ (customer != null ? "customer=" + customer + ", " : "") + "\n"
				+ (orderStatus != null ? "orderStatus=" + orderStatus : "") + "\n"
				+ (computer != null ? "computer=" + computer : "") + "";
	}

}
