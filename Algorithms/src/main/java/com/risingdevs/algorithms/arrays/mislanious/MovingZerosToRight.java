package com.risingdevs.algorithms.arrays.mislanious;

import java.util.Arrays;

public class MovingZerosToRight {

	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 6, 0, 5, 7, 8, 8, 0, 9 };
		System.out.println(Arrays.toString(a));
		moveZerosRight(a);
	}

	static void moveZerosRight(int[] a) {
		if (a == null) {
			System.out.println("array is empty");
			return;
		}
		int i = 0;
		int count = 0;
		int n = a.length;
		while (i < n) {
			if (a[i] == 0) {
				count++;
			}
			else {
				a[i - count] = a[i];
			}
			i++;
		}
		for (int k = 0; k < count; k++) {
			a[n - count + k] = 0;
		}
		System.out.println(Arrays.toString(a));
	}
}
