package com.risingdevs.algorithms.arrays.mislanious;

import java.util.Arrays;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(a));
		leftRotateBruteForce(a, 0);
		leftRotateBruteForce(a, 7);
		leftRotateReverse(a, 3);
		System.out.println(Arrays.toString(a));
	}

	static void leftRotateBruteForce(int[] a, int k) {
		int n = a.length;
		k = k % n;
		if (k == n || k == 0) {
			System.out.println("No Need to rotate");
			return;
		}
		for (int i = 0; i < k; i++) {
			int t = a[0];
			for (int j = 1; j < n; j++) {
				a[j - 1] = a[j];
			}
			a[n - 1] = t;
		}
	}
	
	static void leftRotateReverse(int[] a, int k) {
		int n = a.length;
		k = k % n;
		if (k == n || k == 0) {
			System.out.println("No Need to rotate");
			return;
		}
		reverse(a, 0, k-1);
		reverse(a, k, n-1);
		reverse(a, 0, n-1);
	}

	private static void reverse(int[] a, int i, int j) {
		for(;i<j;i++,j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	static void leftRotateTempArray(int[] a, int k) {
		int n = a.length;
		k = k % n;
		if (k == n || k == 0) {
			System.out.println("No Need to rotate");
			return;
		}
		int temp[] = new int[k];
		// copying the array
		for (int i = 0; i < k; i++) {
			temp[i] = a[i];
		}
		// rotating
		for (int i = 0; i < n - k; i++) {
			a[i] = a[i + k];
		}
		// appending at end
		for (int i = n - k, j = 0; i < n; i++, j++) {
			a[i] = temp[j];
		}
	}
}
