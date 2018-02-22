package com.risingdevs.algorithms.hackerearth.capillary;

import java.util.Scanner;

public class OptimalEdgeWeights {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int m = scr.nextInt();
		for (int i = 0; i < n; i++) {
			scr.nextInt();
			scr.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += scr.nextInt();
		}
		System.out.println(2 * count);
	}
}
