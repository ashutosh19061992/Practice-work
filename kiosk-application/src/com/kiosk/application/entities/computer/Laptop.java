package com.kiosk.application.entities.computer;

public class Laptop extends Computer {

	private double weight;
	private double batteryDuration;

	public Laptop(String compuetId, String cPUSpeed, String hardDiskCapacity, String graphicsCard, Double price,
			String computerType, double weight, double batteryDuration) {

		// calling base class constructor
		super(compuetId, cPUSpeed, hardDiskCapacity, graphicsCard, price, computerType);
		this.weight = weight;
		this.batteryDuration = batteryDuration;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBatteryDuration() {
		return batteryDuration;
	}

	public void setBatteryDuration(double batteryDuration) {
		this.batteryDuration = batteryDuration;
	}

	@Override
	public String toString() {

		return "CId \t Wht \t B.D\t Speed\t H.D.Cap.\t G.C\t Price\t\t ComputerType\n" + getCompuetId() + "\t" + weight
				+ "\t" + batteryDuration + "\t" + getCPUSpeed() + "\t" + getHardDiskCapacity() + "\t\t"
				+ getGraphicsCard() + "\t" + getPrice() + "\t\t" + getComputerType() + "\n\n";
	}

}
