package com.risingdevs.algorithms.hackerearth.capillary;

import java.util.Scanner;

public class MininumNumber2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		for (int z = 0; z < t; z++) {
			int n = scr.nextInt();
			int k = scr.nextInt();
			int q = scr.nextInt();
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				min = Math.min(min, scr.nextInt());
			}
			if (min < q) {
				System.out.println(min);
			}
			else {
				System.out.println("NO");
			}
		}
		scr.close();
	}
}
