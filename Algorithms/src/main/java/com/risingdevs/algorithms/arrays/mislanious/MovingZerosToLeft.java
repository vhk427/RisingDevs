package com.risingdevs.algorithms.arrays.mislanious;

import java.util.Arrays;

public class MovingZerosToLeft {

	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 6, 0, 5, 7, 8, 8, 0, 9 };
		System.out.println(Arrays.toString(a));
		moveZerosLeft(a);
	}

	static void moveZerosLeft(int[] a) {
		if (a == null) {
			System.out.println("array is empty");
			return;
		}
		int n = a.length;
		int i = n - 1;
		int count = 0;
		while (i >= 0) {
			if (a[i] == 0) {
				count++;
			}
			else {
				a[i + count] = a[i];
			}
			i--;
		}
		for (int k = 0; k < count; k++) {
			a[k] = 0;
		}
		System.out.println(Arrays.toString(a));
	}
}
