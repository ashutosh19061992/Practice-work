package com.kiosk.application.entities;

public class Address {
	private String state;
	private String city;
	private String zip;
	private String houseDetails;

	public Address(String state, String city, String zip, String houseDetails) {
		super();
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.houseDetails = houseDetails;
	}

	public Address() {
		super();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getHouseDetails() {
		return houseDetails;
	}

	public void setHouseDetails(String houseDetails) {
		this.houseDetails = houseDetails;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", zip=" + zip + ", houseDetails=" + houseDetails + "]";
	}

}
