package com.xoriant.thread.prime;

public class FIndNthPrimeNumber {
	public long calculateNthPrimeNo(int userInput) {
		int primeCounter = 1, tempCounter = 0;
		while (tempCounter != userInput) {
			primeCounter++;
			if (isPrime(primeCounter))
				tempCounter++;
		}

		return primeCounter;
	}
	
	private static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
