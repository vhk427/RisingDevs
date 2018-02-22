package com.risingdevs.algorithms.tg;

import java.util.Scanner;

public class OddCounts {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		int n = s.length();
		scr.close();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (s.charAt(j) != '0') {
					count += getOddCount(s.substring(j, j + i));
				}
			}
		}
		System.out.println(count);
	}

	private static int getOddCount(String substring) {
		if (substring.charAt(substring.length() - 1) == '0' && substring.lastIndexOf('1') != -1) {
			substring = substring.substring(0, substring.lastIndexOf('1') + 1);
		}
		return substring.charAt(substring.length() - 1) == '1' ? 1 : 0;
	}
}
