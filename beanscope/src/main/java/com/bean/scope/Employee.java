package com.bean.scope;

public class Employee {
	private String name;

	public Employee() {
		System.out.println(">>>> In Employee Constructor >>>." + "\n");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(">>> In employee name is " + name);
	}
}
