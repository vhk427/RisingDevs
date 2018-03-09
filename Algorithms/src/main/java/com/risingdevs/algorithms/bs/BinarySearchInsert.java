package com.risingdevs.algorithms.bs;

public class BinarySearchInsert {

	public static void main(String[] args) {
		int[] a = {1, 3, 6, 8, 10};
		System.out.println(indexForInsert(a, 2));
		System.out.println(indexForInsert(a, 11));
		System.out.println(indexForInsert(a, 7));
	}

	static int indexForInsert(int[] a, int k) {
		int i = 0;
		int j = a.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (k > a[mid]) {
				i = mid + 1;
			}
			else if (k < a[mid]) {
				j = mid - 1;
			}
			else {
				return mid;
			}
		}
		return i;
	}
}
