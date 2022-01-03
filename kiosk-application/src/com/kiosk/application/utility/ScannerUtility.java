package com.kiosk.application.utility;

import java.util.Scanner;

// single instance for Scanner
public final class ScannerUtility {
	private static Scanner scannerUtility = null;
	String name;
	private ScannerUtility() {
	}

	public void getName() {
		System.out.println("name is "  +name);
	}
	public static Scanner getScanner() {
		if (scannerUtility == null) {
			scannerUtility = new Scanner(System.in);
		}
		return scannerUtility;
	}
}
