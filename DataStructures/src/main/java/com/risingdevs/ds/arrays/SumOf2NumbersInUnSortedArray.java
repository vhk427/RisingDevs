package com.risingdevs.ds.arrays;

import java.util.HashSet;
import java.util.Map;

public class SumOf2NumbersInUnSortedArray {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 10, 16, 12, 14, 6, 7, 8, -2 };
		int n = a.length;
		int count = sumOf2NumbersInUnSortedArray(a, 10);
		System.out.println(count);
	}

	private static int sumOf2NumbersInUnSortedArray(int[] a, int sum) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}
		int counter = 0;
		for (int i : a) {
			if (set.contains(sum - i)) {
				set.remove(i);
				counter++;
				System.out.println(i + " " + (sum - i));
			}
		}
		return counter;
	}
}
