package com.xoriant.reffernce.service;

//dependent class
public class Employee {
	private Department department;
	private String name;
	private String designation;
	private String phoneNo;
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		System.out.println(">>>>>>> In Employee Constructor >>>>>>>> ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void display() {
		System.out.println("Employee [department=" + department + ", name=" + name + ", designation=" + designation
				+ ", phoneNo=" + phoneNo + "]");
	}

}
