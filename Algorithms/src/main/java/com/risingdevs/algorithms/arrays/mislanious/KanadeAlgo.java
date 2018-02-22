package com.risingdevs.algorithms.arrays.mislanious;

public class KanadeAlgo {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int max = Integer.MIN_VALUE;
		int currMax = 0;
		for (int i : a) {
			currMax = Math.max(0, currMax + i);
			if (currMax > 0) {
				max = Math.max(currMax, max);
			}
		}
		return max;
	}
}
