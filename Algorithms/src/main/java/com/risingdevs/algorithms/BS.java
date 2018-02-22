package com.risingdevs.algorithms;

public class BS {

	public static void main(String[] args) {
		int[] a = {-1,0,3,5,9,12};
//		System.out.println(search(a, 9));
//		System.out.println(search(a, 2));
		System.out.println(search(new int[]{5}, 5));
	}

	public static int search(int[] a, int f) {
		int l = 0;
		int r = a.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] == f) {
				return m;
			}
			if (f > a[m]) {
				l = m + 1;
			}
			else {
				r = m - 1;
			}
		}
		return -1;
	}
}
