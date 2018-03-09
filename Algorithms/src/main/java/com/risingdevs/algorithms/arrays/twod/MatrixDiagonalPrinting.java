package com.risingdevs.algorithms.arrays.twod;

public class MatrixDiagonalPrinting {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		print(a);
	}

	static void print(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		int r = 0;
		while (r < m) {
			for (int i = r, j = 0; i >= 0; i--, j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			r++;
		}
		r--;
		int c = 1;
		while (c < n) {
			for (int i = r, j = c; j < n; i--, j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			c++;
		}
	}
}
