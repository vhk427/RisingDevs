package com.risingdevs.algorithms.hackerearth.capillary;

import java.util.Scanner;

public class IncenseSticksAndFragrance {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int x1 = scr.nextInt();
		int y1 = scr.nextInt();
		int x2 = scr.nextInt();
		int y2 = scr.nextInt();
		int n = scr.nextInt();
		int[][] co = new int[n][2];
		for (int i = 0; i < n; i++) {
			co[i][0] = scr.nextInt();
		}
		for (int i = 0; i < n; i++) {
			co[i][1] = scr.nextInt();
		}
		double[] t = new double[n];
		// Calculate distances
		for (int i = 0; i < n; i++) {
			t[i] = Math.max(distance(x1, y1, co[i][0], co[i][1]), distance(x2, y2, co[i][0], co[i][1]));
		}
		int q = scr.nextInt();
		for (int z = 0; z < q; z++) {
			int time = scr.nextInt();
			int count = 0;
			for (double temp : t) {
				if (time >= temp) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}

	private static double distance(int x1, int y1, int i, int j) {
		return Math.sqrt(Math.pow(x1 - i, 2) + Math.pow(y1 - j, 2));
	}
}
