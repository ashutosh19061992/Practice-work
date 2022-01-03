package com.xoriant.cstudyone.utility;

import java.util.*;

import com.xoriant.cstudyone.entities.Company;
import com.xoriant.cstudyone.entities.Customer;
import com.xoriant.cstudyone.entities.Employee;
import com.xoriant.cstudyone.entities.PrivilegedCustomer;

public class CompanyUtility {

	// find company employee by id for a company
	public Employee finfEmployeeByCompany(Company company, long employeeId) {
		try {
			Employee employeeDetails = company.getEmployeeList().stream()
					.filter(employee -> employee.getEmployeeId() == employeeId).findAny().get();
			return employeeDetails;
		} catch (Exception exception) {
			throw new RuntimeException("Something went wrong. Record not found.");
		}
	}

	public Double getTotalBasicSalary(Company company) {
		double basicSalary = 0.0;
		for (Employee employee : company.getEmployeeList()) {
			basicSalary += employee.getBasicSalay();
		}
		return basicSalary;
	}

	public Double getTotallRegistrationfees(Company company) {
		Double registrationFees = 0.0;
		try {
			for (Customer customer : company.getCustomersList()) {
				if (customer instanceof PrivilegedCustomer) {
					registrationFees += ((PrivilegedCustomer) customer).getRegistrationFees();
				}
			}
			return registrationFees;
		} catch (Exception e) {
			throw new RuntimeException(
					"Something went wrong, while calculating total Registarion fees for privlaged customer.");
		}
	}

	// find company customer by id for a company
	public Customer finfCutomerByCompany(Company company, long customerId) {
		try {
			Customer customerDetails = company.getCustomersList().stream()
					.filter(cutomer -> cutomer.getCustomerId() == customerId).findAny().get();
			return customerDetails;
		} catch (Exception exception) {
			throw new RuntimeException("Something went wrong. Record not found.");
		}
	}

	// find total customer for a company
	public int totalCustomer(Company company) {
		try {
			return company.getCustomersList().size();
		} catch (Exception exception) {
			return 0;
		}
	}

	// get all privlaged customer of company
	public List<PrivilegedCustomer> getAllPrivlagedCustomer(Company company) {
		List<PrivilegedCustomer> privlagedCustomerList = new ArrayList<PrivilegedCustomer>();
		try {
			for (Customer customer : company.getCustomersList()) {
				if (customer instanceof PrivilegedCustomer) {
					privlagedCustomerList.add(((PrivilegedCustomer) customer));
				}
			}
			return privlagedCustomerList;
		} catch (Exception e) {
			throw new RuntimeException(
					"Something went wrong, while calculating total Registarion fees for privlaged customer.");
		}
	}

	// find total employee for a company
	public int totalEmployee(Company company) {
		return company.getEmployeeList().size();
	}

	public double getAverageOfSalary(Company company) {
		return company.getEmployeeList().stream().filter(employee -> employee.getBasicSalay() > 5000)
				.mapToDouble(Employee::getBasicSalay).average().orElse(Double.NaN);
	}
}
