package com.xoriant.cstudyone.entities;
public class Department {
	private String department;
	
	public Department(String department) {
		super();
		this.department = department;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Department [department=" + department + "]";
	}
}
