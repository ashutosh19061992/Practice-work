package com.kiosk.application.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kiosk.application.entities.Address;
import com.kiosk.application.entities.ComputerSaleShop;
import com.kiosk.application.entities.Customer;
import com.kiosk.application.entities.Order;
import com.kiosk.application.entities.Order.ORDERSTATUS;
import com.kiosk.application.entities.Person;
import com.kiosk.application.entities.computer.Computer;
import com.kiosk.application.entities.computer.Desktop;
import com.kiosk.application.entities.computer.Laptop;
import com.kiosk.application.enums.Gender;
import com.kiosk.application.utility.AdminUtility;
import com.kiosk.application.utility.ComputerUtility;
import com.kiosk.application.utility.CustomerUtility;
import com.kiosk.application.utility.ScannerUtility;

public class MainTest {

	public static void main(String[] args) {
		// Creating Shop
		ComputerSaleShop newAgeComputerShop = new ComputerSaleShop("New Age Computer Shop",
				ComputerUtility.getAllComputerList());

		mainMenu(newAgeComputerShop);
	}
	
	private static void showdminMenus(ComputerSaleShop newAgeComputerShop) {
		Scanner sc = ScannerUtility.getScanner();
		System.out.print("Enter Login Id:");
		String adminUser = sc.nextLine();
		System.out.print("Enter password:");
		String adminPassword = sc.nextLine();

		if (AdminUtility.authenticateAdminUserWith(adminUser, adminPassword)) {
			System.out.println("Authenticated...");
			adminMenus(newAgeComputerShop);
		}
	}

	public static void adminMenus(ComputerSaleShop newAgeComputerShop) {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("-----------------------------------------------------------------------------\r\n"
				+ " ADMIN MENU\r\n" + "----------------------------------------------------------------------------- ");

		System.out.println(
				"c - Create a new Computer p - Process pending Orders m- main menu lpo - delivered order list x - Quit\r\n"
						+ "Please enter your option:c\r\n" + "----------------------------");
		String adminMenu = sc.nextLine();

		switch (adminMenu) {
		case "c":
			createAComputer(newAgeComputerShop);
			break;
		case "p":
			processPendingOrders();
			break;
		case "lpo":
			listOfProcessedOrders();
			break;
		case "m":
			mainMenu(newAgeComputerShop);
			break;
		case "x":
			System.exit(0);
			break;
		}
	}

	private static void listOfProcessedOrders() {
		List<Order> processedOrderList = Customer.getProcessedOrder();
		System.out.println(processedOrderList);
	}

	@SuppressWarnings("null")
	private static void processPendingOrders() {
		Scanner scanner = ScannerUtility.getScanner();
		Customer customer = new Customer();
		List<Order> pendingOrderList = customer.getOrdersList();

		if (pendingOrderList.size() > 0) {
			System.out.println("Pending Order List: ");
			System.out.println(pendingOrderList);
			System.out.println("single order process press (s) \t process all order press (a)");
			String adminRespone = scanner.nextLine();
			if (adminRespone.equals("a")) {
				customer.getOrdersList().forEach(order -> order.setOrderStatus(ORDERSTATUS.DELIVERED));
			} else {
				System.out.println("Enter the orderId which you want to proccess");
				String orderId = scanner.nextLine();
				Order pendingOrder = pendingOrderList.stream().filter(order -> order.getOrderId().equals(orderId))
						.findAny().get();
				if (pendingOrder == null) {
					System.out.println("No order with order-id " + pendingOrder.getOrderId());
				} else {
					pendingOrder.setOrderStatus(ORDERSTATUS.DELIVERED);

					// remove order in pending order list
					pendingOrderList.remove(pendingOrder);

					// add that deliver order into delivered order list
					customer.setProcessedOrder(pendingOrder);
				}
			}
		} else {
			System.out.println("No pending orders.");
		}
	}

	private static void createAComputer(ComputerSaleShop newAgeComputerShop) {
		System.out.println("-----------------------------------------------------------------------------\r\n"
				+ " CUSTOMIZE YOUR COMPUTER MENU\r\n"
				+ "----------------------------------------------------------------------------- ");

		System.out.println("l - Create a new Laptop d - Create a new Desktop b - Back to main menu l\r\n");
		Scanner sc = ScannerUtility.getScanner();
		String computerMenu = sc.nextLine();
		switch (computerMenu) {
		case "1":
			createANewLaptopOrDesktop("1", newAgeComputerShop);
			break;
		case "d":
			createANewLaptopOrDesktop("d", newAgeComputerShop);
			break;
		case "b":
			mainMenu(newAgeComputerShop);
			break;
		}
	}

	private static void mainMenu(ComputerSaleShop newAgeComputerShop) {

		System.out.println("=============================================================================\r\n"
				+ " Welcome to " + newAgeComputerShop.getShopName() + "\r\n"
				+ "============================================================================= ");
		while (true) {
			System.out.println("-----------------------------------------------------------------------------\r\n"
					+ " MAIN MENU\r\n"
					+ "----------------------------------------------------------------------------- ");
			System.out.println(
					"a - Admin Login n - Create a new Customer e - Existing Customer Login s Search m - main menu c- customer list x - Quit \n");

			System.out.println("Please enter your option");
			Scanner scanner = ScannerUtility.getScanner();
			String input = scanner.nextLine();

			switch (input) {

			case "a":
				showdminMenus(newAgeComputerShop);
				break;
			case "n":
				createNewCustomer();
				break;
			case "e":
				existingCustomerLogin();
				break;
			case "s":
				searchComputer();
				break;
			case "c":
				getListOfExistingCustomers();
				break;
			case "m":
				mainMenu(newAgeComputerShop);
				break;
			case "x":
				System.exit(0);
				break;
			}
		}
	}

	private static void getListOfExistingCustomers() {
		System.out.println(CustomerUtility.getAllCustomers());
	}

	private static void searchComputer() {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("Please enter your option:l - Laptop d - Desktop ");
		String computerSearchType = sc.nextLine();
		switch (computerSearchType) {

		case "1":
			showComputers(computerSearchType);
			break;
		case "d":
			showComputers(computerSearchType);
			break;
		}
	}

	private static List<Computer> getAllComputers() {
		return ComputerUtility.getAllComputerList();
	}

	private static void showComputers(String computerSearchType) {
		Scanner sc = ScannerUtility.getScanner();
		List<Computer> allComputerList = ComputerUtility.getAllComputerList();

		if (computerSearchType.equals("1")) {
			List<Laptop> laptopsList = new ArrayList<Laptop>();
			for (Computer computer : allComputerList) {
				if (computer instanceof Laptop) {
					laptopsList.add((Laptop) computer);
				}
			}
			System.out.println(laptopsList);
		} else {
			List<Desktop> deskTopsList = new ArrayList<Desktop>();
			for (Computer computer : allComputerList) {
				if (computer instanceof Desktop) {
					deskTopsList.add((Desktop) computer);
				}
			}
			System.out.println(deskTopsList);
		}
		System.out.println("Do you wish to place order (Y/N)? ");
		String orderRespone = sc.nextLine();
		if (orderRespone.equals("Y")) {
			existingCustomerLogin();
		}
	}

	private static void existingCustomerLogin() {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("Please enter your customerId");
		String customerId = sc.nextLine();

		System.out.println("---Authenticating---");

		Customer existingCustomer = CustomerUtility.findCustomerById(customerId);

		if (existingCustomer != null) {
			System.out.println("Do you wish to place order (Y/N)? ");
			if (sc.nextLine().equals("Y")) {
				initiateOrderFor(existingCustomer);
			}
		} else {
			System.out.println("Please register yourself first.");
		}
	}

	private static void initiateOrderFor(Customer customer) {
		Scanner scanner = ScannerUtility.getScanner();

		System.out.println("Available list of products.");
		System.out.println(getAllComputers());

		System.out.println("Please select the product Id which u want to buy.");
		String computerId = scanner.nextLine();

		Computer customerSelectedComputer = getAllComputers().stream()
				.filter(computer -> computer.getCompuetId().equals(computerId)).findAny().orElse(null);

		if (customerSelectedComputer != null) {
			System.out.println("------------ YOUR PRODUCT DETAILS -----------------------------");
			System.out.println(customerSelectedComputer);

			System.out.println("Press c to confirm your order.");
			String confirmation = scanner.nextLine();
			if (confirmation.equals("c")) {
				Order order = new Order("ORD-CUST-" + customer.getCustomerId(), customer, customerSelectedComputer);
				placeOrder(customer, customerSelectedComputer, order);
			}
		}
	}

	private static void placeOrder(Customer customer, Computer computer, Order orderDetails) {
		System.out.println("=============================================================================\r\n"
				+ " ORDER CONFIRMATION\r\n"
				+ "============================================================================= ");
		System.out.println("OrderId: " + orderDetails.getOrderId());
		System.out.println("Customer Id: " + orderDetails.getCustomer().getCustomerId());
		System.out.println("Customer Name: " + orderDetails.getCustomer().getPersonCustomer().getName());
		System.out.println("Shipping Address: " + orderDetails.getCustomer().getShippingAddress().getHouseDetails()
				+ " " + orderDetails.getCustomer().getShippingAddress().getState());
		System.out.println("Order Status: " + orderDetails.getOrderStatus());
		System.out.println("Ordered Computer: " + orderDetails.getComputer().getCompuetId());
		System.out.println("---------------------------------------------------\r\n"
				+ "Thank you for placing the order with us.\r\n"
				+ "The ordered product will be sent to the above Shipping Address within 48\r\n" + "hours\r\n"
				+ "We request a Cash On Delivery on receipt of the consignment\r\n"
				+ "-----------------------------------------------------------------------------");

		customer.addOrders(orderDetails);
		System.out.println(customer.getOrdersList());
	}

	private static void createNewCustomer() {
		Scanner sc = ScannerUtility.getScanner();
		System.out.println("Enter Customer name: ");
		String customerName = sc.nextLine();
		System.out.println("Enter Customer age: ");
		int customerAge = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter State:");
		String customerState = sc.nextLine();
		System.out.println("Enter City:");
		String customerCity = sc.nextLine();
		System.out.println("Enter zip:");
		String customerZip = sc.nextLine();
		System.out.println("Enter house address:");
		String customerHouseAddress = sc.nextLine();
		Person customerPerson = new Person(customerName, customerAge, Gender.MALE);
		Address customerShippingAddress = new Address(customerState, customerCity, customerZip, customerHouseAddress);
		Customer customer = new Customer("C-" + (CustomerUtility.getAllCustomers().size() - 2), customerPerson,
				customerShippingAddress);
		CustomerUtility.createCustomers(customer);
		System.out.println("Your customer id: " + customer.getCustomerId());
	}

	// creating laptop/desktop
	private static void createANewLaptopOrDesktop(String inputType, ComputerSaleShop newAgeComputerShop) {

		Scanner sc = ScannerUtility.getScanner();
		if (inputType == "1") {
			System.out.println(" CREATE NEW LAPTOP\r\n"
					+ "-----------------------------------------------------------------------------");
		} else {
			System.out.println(" CREATE NEW DESKTOP\r\n"
					+ "-----------------------------------------------------------------------------");
		}

		System.out.println("Enter CPU speed (in GHZ): ");
		String CPUSpeed = sc.nextLine();

		System.out.println("Enter CPU Type: ");
		String cpuType = sc.nextLine();

		System.out.println("Enter Graphics Card:");
		String graphicsCard = sc.nextLine();

		System.out.println("Hard Disk Capacity(in GB):");
		String hardDisCapacity = sc.nextLine();

		System.out.println("Enter price :");
		Double price = sc.nextDouble();

		// input type for laptop creation
		if (inputType == "1") {
			System.out.println("Enter laptop weight:");
			double weight = sc.nextDouble();

			System.out.println("Enter duration of battery:");
			double batteryDuration = sc.nextDouble();
			int size = ComputerUtility.getAllComputerList().size();
			Computer laptopComputer = new Laptop("LAP-" + (size - 5), CPUSpeed, hardDisCapacity, graphicsCard, price,
					cpuType, weight, batteryDuration);
			AdminUtility.addComputer(laptopComputer);
//			input type for desktop creation
		} else {
			int size = ComputerUtility.getAllComputerList().size();
			Computer deskTopComputer = new Desktop("DESK-" + (size - 4), CPUSpeed, hardDisCapacity, graphicsCard, price,
					cpuType, 26);
			AdminUtility.addComputer(deskTopComputer);
		}
	}
}
