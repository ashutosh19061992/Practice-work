package com.xoriant.cstudyone.entities;

public class SalaryCalculator {

	public static int getRateOfAllowance(int band) {
		if (band <= 2) {
			return 30;
		} else if (band > 2 && band <= 4) {
			return 40;
		} else if (band > 4 && band <= 6) {
			return 50;
		} else if (band >= 8) {
			return 65;
		}
		return 0;
	}

	public Double calculateEmployeeSalary(Employee employee) {
		System.out.println(employee.calculateEmployeeSalay(employee));
		return employee.calculateEmployeeSalay(employee);
	}
}