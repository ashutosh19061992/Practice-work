package com.xoriant.cstudyone.entities;

public class Employee {

	private Person person;
	private long employeeId;
	private Department department;
	private Double basicSalay;
	private int band;

	public Employee(Person person, long employeeId, Department department, Double basicSalay, int band) {
		super();
		this.person = person;
		this.employeeId = employeeId;
		this.department = department;
		this.basicSalay = basicSalay;
		this.band = band;
	}

	public Employee() {
		super();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Double getBasicSalay() {
		return basicSalay;
	}

	public void setBasicSalay(Double basicSalay) {
		this.basicSalay = basicSalay;
	}

	public int getBand() {
		return band;
	}

	public void setBand(int band) {
		this.band = band;
	}

	public Double calculateEmployeeSalay(Employee employee) {
		Double salary = 0.0;
		int rateOfAllowance = SalaryCalculator.getRateOfAllowance(employee.getBand());
		if (rateOfAllowance == 0) {
			salary = employee.getBasicSalay();
		} else {
			Double employeeBasicSalary = employee.getBasicSalay();
			salary = (rateOfAllowance * employeeBasicSalary / 100) + employeeBasicSalary;
		}
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [person=" + person + ", employeeId=" + employeeId + ", department=" + department
				+ ", basicSalay=" + basicSalay + ", band=" + band + "]";
	}

}
