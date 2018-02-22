package com.risingdevs.algorithms.monocept;

import java.util.Scanner;

class TestClass {

	public static void main(String args[]) throws Exception {
		// Scanner
		Scanner scr = new Scanner(System.in);
		char[] s = scr.next().toCharArray();
		scr.close();
		int count = s.length;
		for (int i = 1; i < s.length; i++) {
			for (int j = 0; j < s.length - i; j++) {
				if (validate(j, j + i, s)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static boolean validate(int start, int end, char[] s) {
		do {
			if (s[start++] != s[end--]) {
				return false;
			}
		} while (start < end);
		return true;
	}
}
