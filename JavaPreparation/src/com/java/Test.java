package com.java;

public class Test {

	public static void main(String[] args) {
		int[] intArray = {  4, 0, 1, 2, 8};
		int secondLArgestElement = getSecondLargestElement(intArray);
		System.out.println(secondLArgestElement);
	}

	private static int getSecondLargestElement(int[] intArray) {
		int largest = -1;
		int secondLarget = -1;

		for (int i = 0; i < intArray.length; i++) {
			if (largest < intArray[i]) {
				largest = intArray[i];
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			if ((intArray[i] != largest) && (intArray[i] > secondLarget)) {
				secondLarget = intArray[i];
			}
		}
		return secondLarget;
	}
}
