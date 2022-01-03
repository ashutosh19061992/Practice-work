package com.xoriant.local.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

	public static void main(String[] args) throws InterruptedException {

		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1.format(DateTimeFormatter.ISO_DATE)); // 2021-08-28
//		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
//
//		Duration between = Duration.between(initialTime, finalTime);
//		System.out.println(between.getSeconds());

		LocalDate initialDate = LocalDate.now();

		LocalDate finaldate = initialDate.plus(3, ChronoUnit.YEARS);

		System.out.println(ChronoUnit.YEARS.between(initialDate, finaldate));

		System.out.println("-------------FULL DATE-------------------");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

		System.out.println("-------------FULL DATE TIME-------------------");

		LocalDateTime dateTime = LocalDateTime.now();
		ZoneId timeZone = ZoneId.of("Asia/Kolkata");

		LocalDateTime currentTime = LocalDateTime.now(timeZone);
		System.out.println("----------------------------------------------");
		System.out.println(currentTime);
		System.out.println("----------------------------------------------");
		System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(timeZone)));
		System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withZone(timeZone)));
		System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

//		DateTimeFormatter dateTimeFormate = DateTimeFormatter.ofPattern("y-M-dd, HH : mm");
//		LocalDateTime datep = LocalDateTime.now();
//		LocalDateTime plusDays = datep.plusDays(33);
//		System.out.println("Day 33 - " + plusDays.format(dateTimeFormate) + "\n");
//
//		for (int i = 1; i <= 60; i++) {
//			LocalDateTime date = LocalDateTime.now();
//			Thread.sleep(1000);
//			LocalDateTime plusDays2 = date.plusDays(i);
//			System.out.println("Day - " + i + " " + plusDays2.format(dateTimeFormate));
//			if (plusDays2.format(dateTimeFormate).equals(plusDays.format(dateTimeFormate))) {
//				System.out.println("Password expired..");
//				break;
//			}
//		}
	}
}
