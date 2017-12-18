package com.risingdevs.algorithms.ctci.arraysAndStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Hemanth Kumar Velpula
 *         abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */
public class UniqueCharsInString {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		scr.close();
		if (s.length() > 128) {
			System.out.println("No");
			return;
		}
		long start = System.currentTimeMillis();
		approch1(s);
		System.out.println("time for 1st approch: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		approch2(s);
		System.out.println("time for 2nd approch: " + (System.currentTimeMillis() - start));
	}

	private static void approch2(String s) {
		Set<Character> set = new HashSet<Character>();
		char[] c = s.toCharArray();
		for (int i = 1; i <= c.length; i++) {
			set.add(c[i - 1]);
			if (set.size() != i) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	private static void approch1(String s) {
		boolean[] bool = new boolean[128];
		for (char c : s.toCharArray()) {
			if (bool[c]) {
				System.out.println("No");
				return;
			}
			bool[c] = true;
		}
		System.out.println("Yes");
	}
}
