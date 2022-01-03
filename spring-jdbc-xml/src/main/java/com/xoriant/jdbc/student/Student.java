package com.xoriant.jdbc.student;

public class Student {
	private String id;
	private String name;
	private String rollNo;
	private String address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String rollNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
}
