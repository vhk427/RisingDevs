package com.risingdevs.ds.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 7, 9 };
//		System.out.println("0:" + search(0, a));
//		System.out.println("1:" + search(1, a));
//		System.out.println("2:" + search(2, a));
//		System.out.println("3:" + search(3, a));
//		System.out.println("4:" + search(4, a));
//		System.out.println("5:" + search(5, a));
//		System.out.println("6:" + search(6, a));
		System.out.println("7:" + search(7, a));
//		System.out.println("8:" + search(8, a));
//		System.out.println("9:" + search(9, a));
//		System.out.println("10:" + search(10, a));
	}

	private static boolean search(int k, int[] a) {
		int l = 0;
		int r = a.length - 1;
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
