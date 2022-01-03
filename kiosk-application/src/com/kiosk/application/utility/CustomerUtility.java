package com.kiosk.application.utility;

import java.util.ArrayList;
import java.util.List;

import com.kiosk.application.entities.Address;
import com.kiosk.application.entities.Customer;
import com.kiosk.application.entities.Person;
import com.kiosk.application.enums.Gender;

public final class CustomerUtility {
	private static List<Customer> customers = new ArrayList<Customer>();

	public static List<Customer> getAllCustomers() {
		return customers;
	}

	// Added Admins List
	static {
		Person personCustomer = new Person("Ashutosh", 23, Gender.MALE);
		Address customerShippingAddress = new Address("UP", "Lucknow", "226022", "8/911/5, Vikas Nagar");
		Customer ashutoshCustomer = new Customer("C-120", personCustomer, customerShippingAddress);

		Person personCustomerTwo = new Person("Vivek", 23, Gender.MALE);
		Address customerTwoShippingAddress = new Address("UP", "Baliya", "226022", "8/088/5, Vikas Nagar");
		Customer vivekCustomer = new Customer("C-121", personCustomerTwo, customerTwoShippingAddress);

		customers.add(vivekCustomer);
		customers.add(ashutoshCustomer);
	}

	public static boolean createCustomers(Customer customer) {
		if (customers.add(customer)) {
			return true;
		}
		return false;
	}

	public static Customer findCustomerById(String customerId) {

		Customer existingCustomer = customers.stream().filter(customer -> customer.getCustomerId().equals(customerId))
				.findAny().get();
		if (existingCustomer == null) {
			return null;
		}
		return existingCustomer;
	}
}
