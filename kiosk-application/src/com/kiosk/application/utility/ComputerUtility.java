package com.kiosk.application.utility;

import java.util.ArrayList;
import java.util.List;
import com.kiosk.application.entities.computer.Computer;
import com.kiosk.application.entities.computer.Desktop;
import com.kiosk.application.entities.computer.Laptop;

public final class ComputerUtility {

	private static List<Computer> computerList = new ArrayList<Computer>();

	public ComputerUtility() {
		// TODO Auto-generated constructor stub
	}

	public static List<Computer> getAllComputerList() {
		return computerList;
	}

	static {

		// creating desktop's computers
		for (int i = 0; i < 5; i++) {
			Computer deskTopComputer = new Desktop("DESK-" + i, "3.2" + i, "500 GB", "Intel-" + i, 30000.0 + i * 2000,
					"Pentium" + i, 26.0 + (26.0 * i) / 2);
			computerList.add(deskTopComputer);
		}

		// creating Laptop's computers
		for (int i = 0; i < 5; i++) {
			Computer laptops = new Laptop("LAP-" + i, "3.2" + i, "500 GB", "Intel-" + i, 30000.0 + i * 2000,
					"Pentium" + i, 3.1, 4);
			computerList.add(laptops);
		}
		System.out.println("---- COMPUTERS AND DESKTOP CREATED ----------------");
	}

	public static boolean addSingleComputer(Computer computer) {
		try {
			return computerList.add(computer);
		} catch (Exception e) {
			throw new RuntimeException("Cannot add computer to existing list.");
		}
	}
}
