package com.kiosk.application.entities.computer;

public class Desktop extends Computer {
	private double monitorSize;

	public Desktop(String compuetId, String cPUSpeed, String hardDiskCapacity, String graphicsCard, Double price,
			String computerType, double monitorSize) {
		super(compuetId, cPUSpeed, hardDiskCapacity, graphicsCard, price, computerType);
		this.monitorSize = monitorSize;
	}

	public double getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(double monitorSize) {
		this.monitorSize = monitorSize;
	}

	@Override
	public String toString() {
		return "CId \t MontSize \t  Speed\t H.D.Cap.\t G.C\t Price\t\t ComputerType\n" + getCompuetId() + "\t"
				+ getMonitorSize() + "\t\t" + getCPUSpeed() + "\t" + getHardDiskCapacity() + "\t\t" + getGraphicsCard()
				+ "\t" + getPrice() + "\t\t" + getComputerType() + "\n\n";
	}

}
