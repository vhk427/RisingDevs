package com.risingdevs.algorithms.hackerearth.capillary;

import java.util.Scanner;

public class MininumNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		for (int z = 0; z < t; z++) {
			int n = scr.nextInt();
			int k = scr.nextInt();
			int q = scr.nextInt();
			int s[] = new int[k];
			int si = 0;
			int eachSegment = 0;
			if(n%k ==0) {
				eachSegment = n/k;
			} else {
				eachSegment = (n + k - n%k)/k;
			}
			
			for (int i = 0; i < k; i++) {
				for (int j = eachSegment * i; j < eachSegment * (i + 1) && j < n; j++) {
					s[si] = Math.max(s[si], scr.nextInt());
//					System.out.print(j + " ");
				}
//				System.out.println();
				si++;
			}
			int ans = s[0];
			for (int i = 1; i < k; i++) {
				ans = Math.min(s[i], ans);
				System.out.print(s[i] + " ");
			}
			if (ans >= q) {
				System.out.println("NO");
			}
			else {
				System.out.println(ans);
			}
		}
		scr.close();
	}
}
