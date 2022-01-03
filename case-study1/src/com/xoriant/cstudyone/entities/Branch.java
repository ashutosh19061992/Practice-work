package com.xoriant.cstudyone.entities;

public class Branch {
	
	private String branchName;
	private Address address;
	private BranchManager branchManager;
	
	public Branch(String branchName, Address address, BranchManager branchManager) {
		super();
		this.branchName = branchName;
		this.address = address;
		this.branchManager = branchManager;
	}
	
	public Branch() {
		super();
	}
	
	public BranchManager getBranchManager() {
		return branchManager;
	}

	public void setBranchManager(BranchManager branchManager) {
		this.branchManager = branchManager;
	}

	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", address=" + address + ", branchManager=" + branchManager
				+ ", getBranchManager()=" + getBranchManager() + ", getBranchName()=" + getBranchName()
				+ ", getAddress()=" + getAddress() +"]";
	}
}
	
	
