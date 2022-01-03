package com.kiosk.application.entities;


public class Admin {
	private Person person;
	private String adminId;
	private String password;
	
	
	public Admin() {
		super();
	}
	
	public Admin(Person person, String adminId, String password) {
		super();
		this.person = person;
		this.adminId = adminId;
		this.password = password;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [person=" + person + ", adminId=" + adminId + ", password=" + password + "]";
	}
	
}
