package com.xoriant.redbus.booking;

public class Seat {
	private String seatNumber;

	public Seat() {
		super();
	}

	public Seat(String seatNo) {
		super();
		this.seatNumber = seatNo;
	}

	public String getSeatNo() {
		return seatNumber;
	}

	public void setSeatNo(String seatNo) {
		this.seatNumber = seatNo;
	}

	@Override
	public String toString() {
		return "" + seatNumber + "";
	}
}
