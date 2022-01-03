package com.xoriant.redbus.bookticket;

import java.util.List;

import com.xoriant.redbus.booking.Bus;
import com.xoriant.redbus.booking.Passanger;
import com.xoriant.redbus.booking.Seat;
import com.xoriant.redbus.booking.Seats;

public class BookTicket {

	public synchronized boolean bookATicket(Bus bus, String seatNo, Passanger passanger, long milisecond) {
		boolean isSeatBooked = false;
		Seats seats = bus.getSeats();
		List<Seat> seatList = seats.getSeatList();
		Seat seatToBeBooked = seatList.stream().filter(seat -> seat.getSeatNo().equals(seatNo)).findAny().orElse(null);
		if (seatToBeBooked == null) {
			return false;
		}
		if (seatToBeBooked.getSeatNo() == "BOOKED") {
			isSeatBooked = false;
		} else {
			try {
				if (milisecond <= 1000) {
					System.out.println("Intitiating payment for passanger " + passanger.getName() + "\n");
					Thread.sleep(milisecond);
					System.out.println("Payment Done for passanger " + passanger.getName() + "\n");
					seatToBeBooked.setSeatNo("BOOKED");
					isSeatBooked = true;
					System.out.println("After Booking available seats >>" + bus.getSeats() + "\n");
					System.out.println("Available Seats >>  " + bus.getAvailableSeats() + "\n");
				} else {
					Thread.yield();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		return isSeatBooked;
	}
}
