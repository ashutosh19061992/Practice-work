package com.xoriant.thread.printseries;

public class PrintSeries {
	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				printSeries(5);
				System.out.println();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				printSeries(10);
				System.out.println();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				printSeries(50);
				System.out.println();
			}
		}).start();
	}

	public static void printSeries(int statringNo) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * statringNo + " ,");
		}
	}
}
