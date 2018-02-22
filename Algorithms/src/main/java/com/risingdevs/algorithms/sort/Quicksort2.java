package com.risingdevs.algorithms.sort;

import com.risingdevs.algorithms.ArraysUtil;

public class Quicksort2 {

	private int[] numbers;
	private int number;

	public void sort(int[] values) {
		// check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high - low) / 2];
		// Recursion
		if (low < j) quicksort(low, j);
		if (i < high) quicksort(i, high);
	}

	private void swap(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void main(String[] args) {
		Quicksort2 sorter = new Quicksort2();
		sorter.sort(new int[] { 8, 3, 1, 7, 0, 10, 2 });
		ArraysUtil.printArray(sorter.numbers);
	}
}
