package com.xoriant.predefined.funinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DummyTest {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Arun", "Sigapore", 40000.0));
		empList.add(new Employee("Vivek", "Sigapore", 80000.0));
		empList.add(new Employee("Shahsi", "Sigapore", 90000.0));
		empList.add(new Employee("Raja", "Sigapore", 70000.0));
		empList.add(new Employee("Bahubali", "Sigapore", 60000.0));
		empList.add(new Employee("Spiderman", "Sigapore", 50000.0));

		// filter those employee whose salary is greater than 40000.0

		List<Employee> tempList = new ArrayList<Employee>();
//		for (Employee employee : empList) {
//			if (employee.getSalaray() > 50000.0) {
//				tempList.add(employee);
//			}
//		}
//
//		System.out.println(tempList);

		Predicate<Employee> checkEmployeeSalaray = employee -> {
			return employee.getSalaray() > 50000.0 ? true : false;
		};

		List<Employee> collect = tempList.stream().filter(checkEmployeeSalaray).collect(Collectors.toList());
	}
}
