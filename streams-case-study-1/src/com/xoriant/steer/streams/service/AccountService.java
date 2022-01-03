package com.xoriant.steer.streams.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xoriant.steer.streams.account.Account;
import com.xoriant.steer.streams.helper.AccountHelper;
import com.xoriant.steer.streams.utility.AccountUtility;

public class AccountService {

	public AccountService() {
		// TODO Auto-generated constructor stub
	}

	// a
	public List<Account> getAccountsWhoseBalanceIsGreaterThan5K() {
		return AccountUtility.getAllAccountList().stream().filter(AccountHelper.isSalaryGreaterThan5K)
				.collect(Collectors.toList());
	}

	// b
	public List<Account> getAccountsWhoseBalanceIsGreaterThan10KAndFirstNameStartsWithA() {
		return AccountUtility.getAllAccountList().stream()
				.filter(AccountHelper.salarayComparePredicateAndCheckFirstLetter).collect(Collectors.toList());
	}

	// c
	public List<Account> getAllMaleAccountHolder() {
		return AccountUtility.getAllAccountList().stream().filter(AccountHelper.isMaleAccountHolder)
				.collect(Collectors.toList());
	}

	// d
	// and Account opening year should be 2021
	public List<Account> getAllActiveAccountAndBalnceMoreThan3K() {
		return AccountUtility.getAllAccountList().stream().filter(AccountHelper.isSalaryGreaterThan3k)
				.collect(Collectors.toList());

	}

	// e
	public List<Account> getAllEmployeeWithFirstNameUpperCase() {
		return AccountUtility.getAllAccountList().stream().filter(AccountHelper.isFirstLetterUpperCase)
				.collect(Collectors.toList());
	}

	// f
	public double getSumOfTotalBalance() {
		return AccountUtility.getAllAccountList().stream().map(AccountHelper.summingSalary).mapToDouble(Double::valueOf)
				.sum();
	}

	// g
	public List<Account> getAllAccountbarringFirstTwo() {
		return AccountUtility.getAllAccountList().stream().skip(2).collect(Collectors.toList());
	}

	// h
	public List<String> getAllAccountNumbers() {
		return AccountUtility.getAllAccountList().stream().map(AccountHelper.accountHolderName)
				.collect(Collectors.toList());
	}

	// i
	public Map<Double, List<Account>> getAccountOfSameBalance() {
		return AccountUtility.getAllAccountList().stream().collect(Collectors.groupingBy(Account::getBalance));
	}

	// j
	public Map<Double, List<Account>> accountSegregation(double balance) {
//		return AccountUtility.getAllAccountList().stream().filter(account -> account.getBalance() > balance)
//				.collect(Collectors.groupingBy(Account::getBalance));
		return null;
	}

}
