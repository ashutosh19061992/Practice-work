package com.xoriant.user.expiry;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UserMain {

	public static void main(String[] args) throws InterruptedException {

		ZoneId timeZoneId = ZoneId.of("Asia/Kolkata");
		LocalDateTime todaysDateTime = LocalDateTime.now();

		String formatedCurrentDateTime = todaysDateTime
				.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(timeZoneId));
		System.out.println("Current Date Time >>> " + formatedCurrentDateTime + "\n");

		LocalDateTime DateTimeFor33ThDAy = todaysDateTime.plusDays(33);

		String formatedDateTimeFor33ThDAy = DateTimeFor33ThDAy
				.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(timeZoneId));

		System.out.println("Expiry Date Time >>> " + formatedDateTimeFor33ThDAy + "\n");

		for (int i = 1; i <= 40; i++) {
			Thread.sleep(1000);
			LocalDateTime currentDT = todaysDateTime.plusDays(i);
			String formatedCurrentDT = currentDT
					.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(timeZoneId));
			System.out.println("Day-" + i + " " + formatedCurrentDT + "\n");
			if (formatedCurrentDT.equals(formatedDateTimeFor33ThDAy)) {
				System.out.println("Password expired.." + "\n");
				break;
			}
		}
	}
}
