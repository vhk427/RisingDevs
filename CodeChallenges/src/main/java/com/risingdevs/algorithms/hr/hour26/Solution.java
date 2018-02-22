package com.risingdevs.algorithms.hr.hour26;

import java.util.Scanner;

public class Solution {

	static long maximumPeople(int n, long[] p, long[] x, int m, long[] y, long[] r) {
		long cloud = 0;
		int sum = 0;
		for (int i = 0; i < m; i++) {
			long temp = 0;
			long s = y[i] - r[i];
			long e = y[i] + r[i];
			for (int xi = 0; xi < n; xi++) {
				if (s <= x[xi] && e >= x[xi]) {
					temp += p[xi];
				}
			}
			cloud = Math.max(cloud, temp);
		}
		
		for (int i = 0; i < n; i++) {
			for (int xi = 0; xi < m; xi++) {
				if (y[xi] - r[xi] > x[i] ||  y[xi] + r[xi] < x[i]) {
					sum += p[i];
					break;
				}
			}
		}
		return sum + cloud;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] p = new long[n];
		for (int p_i = 0; p_i < n; p_i++) {
			p[p_i] = in.nextLong();
		}
		long[] x = new long[n];
		for (int x_i = 0; x_i < n; x_i++) {
			x[x_i] = in.nextLong();
		}
		int m = in.nextInt();
		long[] y = new long[m];
		for (int y_i = 0; y_i < m; y_i++) {
			y[y_i] = in.nextLong();
		}
		long[] r = new long[m];
		for (int r_i = 0; r_i < m; r_i++) {
			r[r_i] = in.nextLong();
		}
		long result = maximumPeople(n, p, x, m, y, r);
		System.out.println(result);
		in.close();
	}
}
