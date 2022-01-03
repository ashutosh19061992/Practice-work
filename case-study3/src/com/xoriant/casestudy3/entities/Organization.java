package com.xoriant.casestudy3.entities;

public class Organization {
	private String name;

	public Organization(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Organization [" + (name != null ? "name=" + name : "") + "]";
	}
}
