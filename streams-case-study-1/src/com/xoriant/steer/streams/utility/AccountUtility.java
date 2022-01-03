package com.xoriant.steer.streams.utility;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xoriant.steer.streams.account.Account;
import com.xoriant.steer.streams.account.Gender;
import com.xoriant.steer.streams.account.Person;

public final class AccountUtility {

	private static List<Account> accountList = new ArrayList<Account>();

	private AccountUtility() {
		super();
	}

	static {
		accountList.add(new Account(new Person("Ashutosh", "Adarsh", Gender.MALE), "ACC-123456789", LocalDateTime.now(),
				3000.0, true));

		accountList.add(new Account(new Person("Ravi", "Singh", Gender.MALE), "ACC-123578654", LocalDateTime.now(),
				6000.0, true));

		accountList.add(new Account(new Person("Dharmesh", "Chauhan", Gender.MALE), "ACC-877976457",
				LocalDateTime.now(), 5600.0, true));

		accountList.add(new Account(new Person("Dimpy", "Yadav", Gender.FEMALE), "ACC-879865357",
				LocalDateTime.of(2017, 03, 02, 15, 20), 4000.0, false));

		accountList.add(new Account(new Person("Alok", "Diwedi", Gender.MALE), "ACC-789065436",
				LocalDateTime.of(2018, 01, 31, 04, 15), 5000.0, true));

		accountList.add(new Account(new Person("Ritesh", "Singh", Gender.FEMALE), "ACC-903213890",
				LocalDateTime.now(), 1289.0, false));

		accountList.add(new Account(new Person("Mark", "Lincon", Gender.MALE), "ACC-563218976",
				LocalDateTime.of(2019, 04, 30, 11, 01), 6000.0, false));

		accountList.add(new Account(new Person("Davis", "Tiwari", Gender.MALE), "ACC-967432108",
				LocalDateTime.of(2021, 02, 18, 14, 20), 6000.0, true));

		accountList.add(new Account(new Person("Sachin", "Tendulkar", Gender.MALE), "ACC-987543214",
				LocalDateTime.now(), 5000000.0, true));
	}

	public static List<Account> getAllAccountList() {
		return accountList;
	}
}
