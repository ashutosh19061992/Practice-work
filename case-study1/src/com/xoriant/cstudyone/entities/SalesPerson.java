package com.xoriant.cstudyone.entities;

public class SalesPerson extends Employee {

	private Long salesAchieved;
	private Long actualTarget;

	public SalesPerson(Person person, long employeeId, Department department, Double basicSalay, int band,
			Long salesAchieved, Long actualTarget) {
		super(person, employeeId, department, basicSalay, band);
		this.salesAchieved = salesAchieved;
		this.actualTarget = actualTarget;
	}

	public SalesPerson() {
		super();
	}

	public SalesPerson(Person person, long employeeId, Department department, Double basicSalay, int band) {
		super(person, employeeId, department, basicSalay, band);
		// TODO Auto-generated constructor stub
	}

	public Long getSalesAchieved() {
		return salesAchieved;
	}

	public void setSalesAchieved(Long salesAchieved) {
		this.salesAchieved = salesAchieved;
	}

	public Long getActualTarget() {
		return actualTarget;
	}

	public void setActualTarget(Long actualTarget) {
		this.actualTarget = actualTarget;
	}

	public Double calculateEmployeeSalay(Employee employee) {
		Double salary = super.calculateEmployeeSalay(employee);
		double salesEmployeeSalary = salary + (30 * (this.actualTarget - this.salesAchieved) / 100);
		return salesEmployeeSalary;
	}

	@Override
	public String toString() {
		return "SalesPerson [salesAchieved=" + salesAchieved + ", actualTarget=" + actualTarget + ", getPerson()="
				+ getPerson() + ", getEmployeeId()=" + getEmployeeId() + ", getDepartment()=" + getDepartment()
				+ ", getBasicSalay()=" + getBasicSalay() + ", getBand()=" + getBand() + "]";
	}

}
