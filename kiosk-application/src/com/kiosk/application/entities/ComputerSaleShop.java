package com.kiosk.application.entities;

import java.util.ArrayList;
import java.util.List;

import com.kiosk.application.entities.computer.Computer;

public class ComputerSaleShop {
	private String shopName;
	private List<Computer> computerList = new ArrayList<Computer>();

	public ComputerSaleShop(String shopName) {
		super();
		this.shopName = shopName;
	}

	public ComputerSaleShop(String shopName, List<Computer> computerList) {
		super();
		this.shopName = shopName;
		this.computerList = computerList;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Computer> getComputerList() {
		return computerList;
	}

	public void addComputer(Computer computer) {
		this.computerList.add(computer);
	}

	@Override
	public String toString() {
		return "ComputerSaleShop [shopName=" + shopName + ", computerList=" + computerList + "]";
	}
}
