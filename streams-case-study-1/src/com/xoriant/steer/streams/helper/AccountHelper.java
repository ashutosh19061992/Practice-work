package com.xoriant.steer.streams.helper;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Predicate;

import com.xoriant.steer.streams.account.Account;
import com.xoriant.steer.streams.account.Gender;

public final class AccountHelper {

	private AccountHelper() {
		// TODO Auto-generated constructor stub
	}

	public static final Predicate<Account> isSalaryGreaterThan5K = (account) -> {
		return account.getBalance() > 5000.0;
	};

	public static final Predicate<Account> salarayComparePredicateAndCheckFirstLetter = (account) -> {
		return account.getBalance() > 5000.0 && account.getPerson().getFirstName().startsWith("A");
	};

	public static final Predicate<Account> isMaleAccountHolder = (account) -> {
		return account.getPerson().getGender().equals(Gender.MALE);
	};

	public static final Predicate<Account> isSalaryGreaterThan3k = (account) -> {
		return account.getBalance() > 3000.0 && account.isActive() == true
				&& account.getDateOpened().getYear() == LocalDateTime.now().getYear();
	};

	public static final Predicate<Account> isFirstLetterUpperCase = (account) -> {
		String firstName = account.getPerson().getFirstName();
		return Character.isUpperCase(firstName.charAt(0));
	};

	public static final Function<Account, Double> summingSalary = (account) -> {
		return account.getBalance();
	};

	public static final Function<Account, String> accountHolderName = (account) -> {
		return account.getAccountNumber();
	};
}
