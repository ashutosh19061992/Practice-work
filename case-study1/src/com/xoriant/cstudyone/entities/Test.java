package com.xoriant.cstudyone.entities;

import java.util.Date;

import com.xoriant.cstudyone.utility.CompanyUtility;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		// ---------------------------MANAGER PERSON DETAILS
		Address managerAddress = new Address("UP", "Lucknow", "226022");
		Person mangerPerson = new Person("Ashutosh", 28, managerAddress);
		Department department = new Department("Manager");
		Employee manager = new BranchManager(mangerPerson, 1234, department, 35000.0, 2, 1500L);

//		// ---------------------------SALES PERSON DETAILS
		Address salesPersonAddress = new Address("UP", "Lucknow", "226022");
		Person salesPerson = new Person("Ravi Prakash", 28, salesPersonAddress);
		Department salesPersondepartment = new Department("Sales");
		Employee salesEmployee = new SalesPerson(salesPerson, 12345L, salesPersondepartment, 35000.0, 2, 150L, 40L);

//		// --------------------EMPLOYEE LIST
		List<Employee> employeList = new ArrayList<Employee>();
		employeList.add(salesEmployee);
		employeList.add(manager);

//		// ---------------------------SALARY CALCULATOR
		SalaryCalculator calculator = new SalaryCalculator();
		calculator.calculateEmployeeSalary(manager);

		// ---------------------------CUSTOMER DETAILS
		Address customerAddress = new Address("UP", "Baliya", "226082");
		Person customerPerson = new Person("Dummy Name", 37, customerAddress);
		Customer customer = new Customer(customerPerson, 23456, customerAddress, new Date());

		// ---------------------------PRIVLAGED CUSTOMER DETAILS
		Address privlagedCustomerAddress = new Address("Bihar", "Arah", "109211");
		Person privlagedCustomerPerson = new Person("Privlaged Customer", 40, privlagedCustomerAddress);

		Customer privlagedCustomer = new PrivilegedCustomer(privlagedCustomerPerson, 156L, privlagedCustomerAddress,
				new Date(), 3500.0, new Date(), 10);

		// ---------------------------CUSTOMER LIST
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer);
		customerList.add(privlagedCustomer);

		// -----------------------------------STORING COMPANY DETAILS
		Company company = new Company(new Date(), "XYZ Private Solutions", employeList, customerList, customerAddress);

		// UTILITY METHODS USAGE
		CompanyUtility utility = new CompanyUtility();
		System.out.println(utility.finfCutomerByCompany(company, 23456));
		System.out.println(utility.totalCustomer(company));
		System.out.println(utility.finfEmployeeByCompany(company, 1234));
		System.out.println(utility.finfEmployeeByCompany(company, 456456));
		System.out.println(utility.getTotallRegistrationfees(company));
		System.out.println(utility.getAllPrivlagedCustomer(company));
	}
}
