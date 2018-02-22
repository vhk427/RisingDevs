package com.risingdevs.algorithms.weekcode36;

import java.util.Scanner;

public class RussianRoulette {

	static void revisedRussianRoulette(int[] d) {
		int min = 0;
		int max = 0;
		boolean flag = false;
		if (d[0] == 1) {
			flag = true;
			min++;
			max++;
		}
		for (int i = 1; i < d.length; i++) {
			if (d[i] == 1) {
				max++;
				if (!flag) {
					flag = true;
					min++;
				} else {
					flag = false;
				}
			}
			else {
				flag = false;
			}
		}
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] doors = new int[n];
		for (int doors_i = 0; doors_i < n; doors_i++) {
			doors[doors_i] = in.nextInt();
		}
		revisedRussianRoulette(doors);
		in.close();
	}
}
