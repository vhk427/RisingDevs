package com.risingdevs.ds.arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7 };
		int b[] = { 2, 4, 6, 8 };
		int m = a.length;
		int n = b.length;
		int c[] = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		// Traverse both array
		while (i < m && j < n) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		// Store remaining elements of first array
		while (i < m)
			c[k++] = a[i++];
		// Store remaining elements of second array
		while (j < n)
			c[k++] = b[j++];
		for (int p : c) {
			System.out.print(p + " ");
		}
	}
}
