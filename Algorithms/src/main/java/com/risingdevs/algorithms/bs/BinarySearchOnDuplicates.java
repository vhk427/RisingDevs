package com.risingdevs.algorithms.bs;

public class BinarySearchOnDuplicates {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4, 5, 5, 7 };
		System.out.println(binarySearch(a, 3) + 1);
		System.out.println(binarySearchID(a, 3) + 1);
		System.out.println(binarySearch(a, 5) + 1);
		System.out.println(binarySearchID(a, 5) + 1);
	}

	static int binarySearch(int[] a, int k) {
		int l = 0;
		int r = a.length - 1;
		int m = 0;
		while (l <= r) {
			m = (l + r) / 2;
			if (a[m] == k) {
				break;
			}
			else if (a[m] > k) {
				r = m - 1;
			}
			else {
				l = m + 1;
			}
		}
		if (l <= r) {
			if (m == 0) {
				return 0;
			}
			while (m > 0 && a[m] == a[--m]);
			return ++m;
		}
		return -1;
	}

	static int binarySearchID(int[] a, int k) {
		int l = 0;
		int r = a.length - 1;
		int m = 0;
		while (l <= r) {
			m = (l + r) / 2;
			if (a[m] == k && (m == 0 || a[m - 1] < k)) {
				return m;
			}
			else if (a[m] > k) {
				r = m - 1;
			}
			else {
				l = m + 1;
			}
		}
		
		return -1;
	}
}
