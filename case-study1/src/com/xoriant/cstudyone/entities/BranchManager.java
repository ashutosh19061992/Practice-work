package com.xoriant.cstudyone.entities;

public class BranchManager extends Employee {
	private Long specialAllowances;

	public BranchManager(Person person, long employeeId, Department department, Double basicSalay, int band,
			Long specialAllowances) {
		super(person, employeeId, department, basicSalay, band);
		this.specialAllowances = specialAllowances;
	}

	public BranchManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getSpecialAllowances() {
		return specialAllowances;
	}

	public void setSpecialAllowances(Long specialAllowances) {
		this.specialAllowances = specialAllowances;
	}

	public Double calculateEmployeeSalay(Employee employee) {
		Double salary = super.calculateEmployeeSalay(employee);
		Double branchManagerSalary = salary + this.specialAllowances;
		return branchManagerSalary;
	}

	@Override
	public String toString() {
		return "BranchManager [specialAllowances=" + specialAllowances + ", getPerson()=" + getPerson()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getDepartment()=" + getDepartment() + ", getBasicSalay()="
				+ getBasicSalay() + ", getBand()=" + getBand() + "]";
	}
}
