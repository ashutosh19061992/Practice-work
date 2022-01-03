package com.xoriant.steer.streams.testmain;

import com.xoriant.steer.streams.service.AccountService;

public class TestMain {
	public static void main(String[] args) {

		AccountService accountService = new AccountService();
	
		System.out.println(accountService.getAccountsWhoseBalanceIsGreaterThan5K());
		System.out.println(accountService.getAccountsWhoseBalanceIsGreaterThan10KAndFirstNameStartsWithA());

		System.out.println(accountService.getAllMaleAccountHolder());
		System.out.println(accountService.getAllActiveAccountAndBalnceMoreThan3K());

		System.out.println(accountService.getAllEmployeeWithFirstNameUpperCase());
		System.out.println(accountService.getAllAccountbarringFirstTwo());

		System.out.println(accountService.getSumOfTotalBalance());
		System.out.println(accountService.getAllAccountbarringFirstTwo());

		System.out.println(accountService.getAllAccountNumbers());
		System.out.println(accountService.getAccountOfSameBalance());

	}
}
