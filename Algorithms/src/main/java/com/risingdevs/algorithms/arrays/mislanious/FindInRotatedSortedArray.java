package com.risingdevs.algorithms.arrays.mislanious;

public class FindInRotatedSortedArray {

	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 1, 2, 3, 4 };
		System.out.println(search(a, 0, a.length - 1, 4));
	}

	static int search(int a[], int l, int h, int k) {
		if (l > h) return -1;
		int mid = (l + h) / 2;
		if (a[mid] == k) {
			return mid;
		}
		if (a[l] <= a[mid]) {
			if (k >= a[l] && k <= a[mid]) {
				return search(a, l, mid - 1, k);
			}
			else {
				return search(a, mid + 1, h, k);
			}
		}
		if (k >= a[mid] && k <= a[h]) {
			return search(a, mid + 1, h, k);
		}
		return search(a, l, mid - 1, k);
	}
}
