package com.xoriant.eshop.model;

public class Address {

	private String city;
	private String state;
	private String phoneNo;
	private String houseNo;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String state, String phoneNo, String houseNo) {
		super();
		this.city = city;
		this.state = state;
		this.phoneNo = phoneNo;
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", phoneNo=" + phoneNo + ", houseNo=" + houseNo + "]";
	}
}
