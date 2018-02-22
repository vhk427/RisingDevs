package com.risingdevs.ds.arrays;

public class BinarySearchRotatedArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 7, 9 };
		int[] b = { 9, 7, 1, 2, 3, 5 };
		int[] c = { 3, 5, 7, 9, 1, 2 };
		System.out.println("2, a:" + search(2, a));
		System.out.println("2, b:" + search(2, b));
		System.out.println("2, c:" + search(2, c));
	}

	private static boolean search(int k, int[] a) {
		int l = 0;
		int r = a.length - 1;
		int p = (l + r + 1) / 2;
		//if(true)
		return search(k, a, 0, a.length - 1);
	}

	private static boolean search(int k, int[] a, int l, int r) {
		int p = 0;
		while (r >= l) {
			p = (l + r + 1) / 2;
			if (k == a[p]) {
				return true;
			}
			if (a[p] > k) {
				r = p - 1;
			}
			else {
				l = p + 1;
			}
		}
		return false;
	}
}
