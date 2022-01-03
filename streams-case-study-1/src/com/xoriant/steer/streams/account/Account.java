package com.xoriant.steer.streams.account;

import java.time.LocalDateTime;

public class Account {

	private Person person;
	private String accountNumber;
	private LocalDateTime dateOpened;
	private boolean isActive;
	private double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Person person, String accountNumber, LocalDateTime dateOpened, double balance, boolean isActive) {
		super();
		this.person = person;
		this.accountNumber = accountNumber;
		this.dateOpened = dateOpened;
		this.isActive = isActive;
		this.balance = balance;

	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDateTime getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(LocalDateTime dateOpened) {
		this.dateOpened = dateOpened;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [person=" + person + ", accountNumber=" + accountNumber + ", dateOpened=" + dateOpened
				+ ", isActive=" + isActive + ", balance=" + balance + "]";
	}
}
