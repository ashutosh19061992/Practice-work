package com.xoriant.cstudyone.entities;
import java.util.*;

public class Company {
	
	private Date dateOfIncorporation;
	private String companyName;
	private List<Employee> employeeList;
	private List<Customer> customersList;
	private Address address;
	
	
	public Company(Date dateOfIncorporation, String companyName, List<Employee> employeeList,
			List<Customer> customersList, Address address) {
		super();
		this.dateOfIncorporation = dateOfIncorporation;
		this.companyName = companyName;
		this.employeeList = employeeList;
		this.customersList = customersList;
		this.address = address;
	}


	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Date getDateOfIncorporation() {
		return dateOfIncorporation;
	}


	public void setDateOfIncorporation(Date dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}


	public List<Customer> getCustomersList() {
		return customersList;
	}


	public void setCustomersList(List<Customer> customersList) {
		this.customersList = customersList;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Company [dateOfIncorporation=" + dateOfIncorporation + ", companyName=" + companyName
				+ ", employeeList=" + employeeList + ", customersList=" + customersList + ", address=" + address + "]";
	}
	
}
