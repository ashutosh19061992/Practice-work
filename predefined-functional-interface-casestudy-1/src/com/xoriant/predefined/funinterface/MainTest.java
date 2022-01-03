package com.xoriant.predefined.funinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainTest {

	public static void main(String[] args) {
		
		// ------------------Funtion-------------------------------------------------
		Function<String, Integer> funtion = (String name) -> {
			return name.length();
		};
		System.out.println(funtion.apply("Ashutosh"));

		Function<String, Integer> function = name -> name.length();
		function.apply("Ashutosh");

		Function<Integer, Integer> f1 = number -> number * 3;
		Function<Integer, Integer> f2 = number -> number * number * number;
		System.out.println(f1.andThen(f2).apply(3));

		// ---------------------Predicate----------------------------------------------
		Predicate<Integer> checkIsEven = number -> {
			return (number % 2 == 0) ? true : false;
		};
		System.out.println(checkIsEven.test(4));

		Predicate<Integer> isEven = (Integer number) -> {
			return number % 2 == 0 ? true : false;
		};
		System.out.println(isEven.test(23));
		// ---------------------Consumer-----------------------------------------------
		Consumer<Integer> intConsume = (number) -> {
			System.out.println(number * 2);
		};
		intConsume.accept(23);

		// -----------------------Supplier----------------------------------------------
		Supplier<Employee> intSupplier = () -> {
			return new Employee("Ashutosh", "Lucknow");
		};
		System.out.println(intSupplier.get());

		// ----------------------BiPredicate: two argument------------------------------
		BiPredicate<Integer, Integer> biPredicate = (numOne, numTwo) -> (numOne + numTwo) % 2 == 0;
		System.out.println(biPredicate.test(23, 23));

		// ----------------------BiConsumer: two argument ------------------------------
		BiConsumer<Employee, Employee> biConsumerEmployee = (Employee e1, Employee e2) -> {
			System.out.println(e1);
			System.out.println(e2);
		};
		biConsumerEmployee.accept(new Employee("Ravi", "Banglore"), new Employee("Shashi", "Rajasthan"));

		// ----------------------BiFunctional: two argument
		// ------------------------------
		BiFunction<Employee, Employee, String> getBothEmployeCity = (employe1, employee2) -> {
			return employe1.getAddress() + " and " + employee2.getAddress();
		};
		System.out.println(
				getBothEmployeCity.apply(new Employee("Ravi", "New Delhi"), new Employee("Ramesh", "Lucknow")));
		// -----------------------BinaryOperator--------------------------------------------

		Comparator<Employee> emplyeeCustomComparator = (Employee e1, Employee e2) -> {
			return e1.getSalaray() > e2.getSalaray() ? 1 : (e1.getSalaray() == e2.getSalaray()) ? 0 : 1;
		};

		BinaryOperator<Employee> employeeOperator = BinaryOperator.maxBy(emplyeeCustomComparator);
		Employee apply = employeeOperator.apply(new Employee("Raju", "New Delhi", 40000.0), new Employee("Raju", "New Delhi", 40000.0));
		System.out.println(apply);
		List<Integer> intList = new ArrayList<Integer>();
		
		//-----------------------BooleanSupplier-------------------------------------
	}
}
