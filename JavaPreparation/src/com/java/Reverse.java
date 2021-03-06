package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		// length = 7
		// { 0, 1, 2, 3, 4, 5, 6}
//		int[] intArray = { 1, 2, 3, 4, 5, 6, 9, 34, 54, 90, 2222, 3, 345, 578, 67, 67, 0 };
//
//		for (int i = 0; i < intArray.length / 2; i++) {
//
//			int first = intArray[i];
//			int lastIndex = intArray.length - 1 - i;
//			int last = intArray[lastIndex];
//
//			intArray[i] = last;
//			intArray[lastIndex] = first;
//		}
//
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.print(intArray[i] + ",");
//		}

		int[] array = { 10, 640, 26, 276, 224, 737, 677, 893, 87, 422, 30, 10, 2 };
		List<Integer> originalList = new ArrayList<>();

		for (int i : array) {
			originalList.add(i);
		}
		
		List<List<Integer>> indexList = new ArrayList<List<Integer>>();
		List<Integer> zerothIndex = new ArrayList<Integer>();
		zerothIndex.add(0);
		zerothIndex.add(1);

		List<Integer> firstIndex = new ArrayList<Integer>();
		firstIndex.add(5);
		firstIndex.add(4);

		List<Integer> thirdIndex = new ArrayList<Integer>();
		thirdIndex.add(0);
		thirdIndex.add(4);

		indexList.add(zerothIndex);
		indexList.add(firstIndex);
		indexList.add(thirdIndex);

		for (List<Integer> index : indexList) {
			Collections.swap(originalList, index.get(0), index.get(1));
		}

		System.out.println("Modified List: " + originalList);
	}
}
