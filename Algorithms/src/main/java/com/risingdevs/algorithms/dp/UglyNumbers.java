package com.risingdevs.algorithms.dp;

/**
 * Numbers divides by powers of 2, 3, 5
 *
 */
public class UglyNumbers {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.nthUglyNumber(10));
		System.out.println(sol.nthUglyNumber(100));
		System.out.println(sol.nthUglyNumber(1));
		System.out.println(sol.nthUglyNumber(10));
		System.out.println(sol.nthUglyNumber(99));
	}
}
