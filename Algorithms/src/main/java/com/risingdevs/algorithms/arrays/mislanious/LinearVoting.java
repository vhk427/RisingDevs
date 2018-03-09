package com.risingdevs.algorithms.arrays.mislanious;

public class LinearVoting {

	public static void main(String[] args) {
		int[] a = {2, 4, 5, 4, 1, 4, 2, 4, 3, 4, 3, 4, 2, 4, 4 };
		System.out.println(getMajarity(a));
	}

	public static int getMajarity(int[] array) {
		int e = -1;
		int c = 0;
		for (int a : array) {
			if (c == 0) {
				e = a;
				c++;
			}
			else if (e == a) {
				c++;
			}
			else {
				c--;
			}
		}
		return e;
	}
}
