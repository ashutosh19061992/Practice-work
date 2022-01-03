package com.xoriant.predefined.funinterface;

public class Employee {

	private String name;
	private String address;
	private Double salaray;

	public Employee(String name, String address, Double salaray) {
		super();
		this.name = name;
		this.address = address;
		this.salaray = salaray;
	}

	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Double getSalaray() {
		return salaray;
	}

	public void setSalaray(Double salaray) {
		this.salaray = salaray;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salaray=" + salaray + "]";
	}

	public String getEmpDetails() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
}
