package com.kiosk.application.utility;

import java.util.ArrayList;
import java.util.List;

import com.kiosk.application.entities.Admin;
import com.kiosk.application.entities.Person;

import com.kiosk.application.entities.computer.Computer;
import com.kiosk.application.enums.Gender;
import com.kiosk.application.exceptions.InvalidAdminUserAndPasswordException;

public final class AdminUtility {
	private static List<Admin> admins = new ArrayList<Admin>();

	public AdminUtility() {
		// TODO Auto-generated constructor stub
	}

	public static List<Admin> getAdminUserList() {
		return admins;
	}

	// Added Admins List
	static {

		Person adminPersonOne = new Person("Admin-1", 34, Gender.MALE);
		admins.add(new Admin(adminPersonOne, "Admin-1", "Admin-1"));

		Person adminPersonTwo = new Person("Admin-2", 60, Gender.MALE);
		admins.add(new Admin(adminPersonTwo, "Admin-2", "Admin-2"));

		Person adminPersonThree = new Person("Admin-3", 30, Gender.FEMALE);
		admins.add(new Admin(adminPersonThree, "Admin-3", "Admin-3"));
		System.out.println("---- CREATED ADMIN USERS ----------------");
	}

	// basic string compare authentication
	public static boolean authenticateAdminUserWith(String userId, String password) {
		try {
			Admin adminToBeAuthenticated = AdminUtility.getAdminUserList().stream()
					.filter(admin -> admin.getAdminId().equals(userId) && admin.getPassword().equals(password))
					.findAny().get();
			if (adminToBeAuthenticated == null) {
				return false;
			}

		} catch (Exception e) {
			throw new InvalidAdminUserAndPasswordException("Invalid user/password. Try again.");
		}
		return true;
	}

	public static boolean addComputer(Computer computer) {
		if (ComputerUtility.addSingleComputer(computer)) {
			return true;
		}
		return false;
	}
}
