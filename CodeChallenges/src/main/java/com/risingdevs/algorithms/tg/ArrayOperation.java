package com.risingdevs.algorithms.tg;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scr.nextInt();
		}
		int t = scr.nextInt();
		for (int z = 0; z < t; z++) {
			int q = scr.nextInt();
			if (q == 1) {
				int u = scr.nextInt();
				int p = scr.nextInt();
				a[u - 1] = p;
			}
			else if (q == 2) {
				int l = scr.nextInt();
				int r = scr.nextInt();
				int p = scr.nextInt();
				int id = l - 1;
				int diff = Integer.MAX_VALUE;
				for (int i = id; i < r; i++) {
					int d = a[i] - p;
					if (d < diff && d > 0) {
						diff = d;
						id = i;
					}
				}
				if(diff != Integer.MAX_VALUE) {
					System.out.println(a[id]);
				} else {
					System.out.println(-1);
				}
			}
		}
	}
}
