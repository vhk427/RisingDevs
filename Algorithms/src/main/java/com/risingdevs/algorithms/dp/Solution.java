package com.risingdevs.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	static int[] u = null;

	public Solution() {
		u = new int[1690];
		u[0] = 1;
	}

	static int count = 1;

	public int nthUglyNumber(int n) {
		if (count > n) {
			return u[n - 1];
		}
		int c = count;
		int i = u[c - 1];
		while (c < n) {
			i++;
			if (isUgly(i)) {
				u[c++] = i;
			}
		}
		count = n - 1;
		return i;
	}

	public int maxDivide(int a, int b) {
		while (a % b == 0) {
			a = a / b;
		}
		return a;
	}

	public boolean isUgly(int no) {
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);
		return (no == 1) ? true : false;
	}
}
