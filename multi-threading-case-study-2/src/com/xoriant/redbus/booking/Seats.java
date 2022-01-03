package com.xoriant.redbus.booking;

import java.util.ArrayList;
import java.util.List;

public class Seats {

	private List<Seat> seatList = new ArrayList<Seat>();

	public Seats() {
		super();
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public boolean addSeat(Seat seat) {
		return this.seatList.add(seat);
	}

	@Override
	public String toString() {
		return "" + seatList + "";
	}
}
