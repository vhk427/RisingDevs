package com.risingdevs.algorithms.leadics;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		int a[] = new int[1000];
		for (int i = 0; i < t; i++) {
			int n = scr.nextInt();
			for (int j = 0; j < n; j++) {
				a[j] = scr.nextInt();
			}
			int max = a[0];
			int prev = 1;
			System.out.print(1 + " ");
			for (int j = 1; j < n; j++) {
				int count = 1;
				if (max <= a[j]) {
					System.out.print((j + 1) + " ");
					max = a[j];
					prev = j + 1;
					continue;
				}
				if (a[j] > a[j - 1]) {
					count = prev;
					for (int k = j - prev; k >= 0; k--) {
						if (a[k] <= a[j]) {
							count++;
						}
						else {
							break;
						}
					}
					System.out.print(count + " ");
					prev = count;
				}
				else if(a[j] == a[j - 1]){
					++prev;
					System.out.print(prev + " ");
				} else {
					System.out.print(1 + " ");
					prev = 1;
				}
			}
			System.out.println();
		}
		scr.close();
	}
}
