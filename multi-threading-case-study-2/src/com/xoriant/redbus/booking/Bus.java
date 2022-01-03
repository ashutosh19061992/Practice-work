package com.xoriant.redbus.booking;

import java.util.List;

public class Bus {

	private String busName;
	private Seats seats;
	
	public Bus(String busName, Seats seats) {
		super();
		this.busName = busName;
		this.seats = seats;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public Seats getSeats() {
		return seats;
	}

	public void setSeats(Seats seats) {
		this.seats = seats;
	}
	
	@Override
	public String toString() {
		return "busName=" + busName + ", seats=" + seats + "";
	}
	
	public long getAvailableSeats() {
		List<Seat> seatList = this.seats.getSeatList();
		long availableSeats = seatList.stream().filter(seat -> seat.getSeatNo() != "BOOKED").count();
		return availableSeats;
	}
}
