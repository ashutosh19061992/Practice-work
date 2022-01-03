package com.kiosk.application.entities.computer;

public class Computer {

	private String compuetId;
	private String CPUSpeed;
	private String hardDiskCapacity;
	private String graphicsCard;
	private Double price;
	private String computerType;
	
	public Computer(String compuetId, String cPUSpeed, String hardDiskCapacity, String graphicsCard, Double price,
			String computerType) {
		super();
		this.compuetId = compuetId;
		this.CPUSpeed = cPUSpeed;
		this.hardDiskCapacity = hardDiskCapacity;
		this.graphicsCard = graphicsCard;
		this.price = price;
		this.computerType = computerType;
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCompuetId() {
		return compuetId;
	}

	public void setCompuetId(String compuetId) {
		this.compuetId = compuetId;
	}

	public String getCPUSpeed() {
		return CPUSpeed;
	}

	public void setCPUSpeed(String cPUSpeed) {
		CPUSpeed = cPUSpeed;
	}

	public String getHardDiskCapacity() {
		return hardDiskCapacity;
	}

	public void setHardDiskCapacity(String hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getComputerType() {
		return computerType;
	}

	public void setComputerType(String computerType) {
		this.computerType = computerType;
	}

	@Override
	public String toString() {
		return "Computer [compuetId=" + compuetId + ", CPUSpeed=" + CPUSpeed + ", hardDiskCapacity=" + hardDiskCapacity
				+ ", graphicsCard=" + graphicsCard + ", price=" + price + ", computerType=" + computerType + "]";
	}
}
