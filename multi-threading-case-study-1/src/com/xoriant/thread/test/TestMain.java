package com.xoriant.thread.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.xoriant.thread.prime.FIndNthPrimeNumber;

public class TestMain {

	public static void main(String[] args) {
		List<Thread> threadStateList = new ArrayList<Thread>();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		FIndNthPrimeNumber fIndNthPrimeNumber = new FIndNthPrimeNumber();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(5000);
						printThreadStates(threadStateList);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

		while (true) {
			System.out.print("Enter the th no or 0 to exit: ");
			int userInput = scanner.nextInt();
			if (userInput == 0) {
				break;
			}
			Thread mainsChildThread = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(fIndNthPrimeNumber.calculateNthPrimeNo(userInput));
				}
			});
			// setting the deamon thread, life cycle is controlled by main thread
			mainsChildThread.setDaemon(true);
			mainsChildThread.start();
			threadStateList.add(mainsChildThread);
		}
	}

	public static void printThreadStates(List<Thread> threadList) {
		for (Thread thread : threadList) {
			System.out.println("name = " + thread.getName() + " state = " + thread.getState());
		}
	}
}
