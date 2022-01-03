package com.xoriant.redbus.booking.main;

import com.xoriant.redbus.booking.Seats;
import com.xoriant.redbus.bookticket.BookTicket;
import com.xoriant.redbus.booking.Bus;
import com.xoriant.redbus.booking.Passanger;
import com.xoriant.redbus.booking.Seat;

public class Main {

	public static void main(String[] args) {
		Seats busSeats = new Seats();
		
		for (int i = 1; i <= 30; i++) {
			busSeats.addSeat(new Seat(i + "A"));
		}
		
		Bus redBus = new Bus("AR-Travels", busSeats);

		BookTicket bookTicket = new BookTicket();
		System.out.println("Before Booking available seats >>" + redBus.getAvailableSeats() + "\n");
		System.out.println("Bus Seats before booking >>  " + busSeats + "\n");

		Passanger passangerOne = new Passanger("Gaurav");
		passangerOne.addSeatTobeBooked("1A");
		passangerOne.addSeatTobeBooked("2A");
		passangerOne.addSeatTobeBooked("3A");
		
		Passanger passangerTwo = new Passanger("Vivek");
		passangerTwo.addSeatTobeBooked("4A");
		passangerTwo.addSeatTobeBooked("6A");
		
		System.out.println(busSeats);
		new Thread(new Runnable() {

			public void run() {
				for (String seatNo : passangerOne.getSeatsToBeBooked()) {
					bookTicket.bookATicket(redBus, seatNo, passangerOne, 1000);
				}
			}
		}).start();

		new Thread(new Runnable() {

			public void run() {
				for (String seatNo : passangerTwo.getSeatsToBeBooked()) {
					bookTicket.bookATicket(redBus, seatNo, passangerTwo, 1000);
				}
			}
		}).start();
	}
}
