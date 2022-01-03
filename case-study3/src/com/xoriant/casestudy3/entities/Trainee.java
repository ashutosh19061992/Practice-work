package com.xoriant.casestudy3.entities;

public class Trainee {
	private String name;

	public Trainee(String name) {
		super();
		this.name = name;
	}

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainee [" + (name != null ? "name=" + name : "") + "]";
	}
	
	
}
