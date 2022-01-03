package com.xoriant.redbus.booking;

import java.util.ArrayList;
import java.util.List;

public class Passanger {

	private String name;
	private List<String> seatToBeBooked;

	public Passanger(String name) {
		super();
		seatToBeBooked = new ArrayList<String>(2);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSeatsToBeBooked() {
		return seatToBeBooked;
	}

	public boolean addSeatTobeBooked(String seatToBeBooked) {
		if (this.seatToBeBooked.size() >= 2) {
			System.out.println("No booking allowed for more than 2.");
			return false;
		} else {
			return this.seatToBeBooked.add(seatToBeBooked);
		}
	}
}
