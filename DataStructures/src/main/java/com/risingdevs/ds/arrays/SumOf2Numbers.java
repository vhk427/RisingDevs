package com.risingdevs.ds.arrays;

public class SumOf2Numbers {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9, 10 };
		int k = 12;
		int l = 0;
		int r = a.length - 1;
		while (r > l) {
			if (a[l] + a[r] == k) {
				System.out.println(a[l] + " " + a[r]);
				break;
			}
			if (a[l] + a[r] > k) {
				r--;
			}
			else {
				l++;
			}
		}
		if (r <= l) {
			System.out.println("Count not possible");
		}
	}
}
