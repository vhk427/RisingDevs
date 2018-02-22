package com.risingdevs.techgig.ca;

import java.util.Scanner;

public class CandidateCode {

	public static void main(String args[]) throws Exception {
		Scanner scr = new Scanner(System.in);
		char[] a = scr.next().toCharArray();
		char[] b = scr.next().toCharArray();
		scr.close();
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < a.length && j < b.length) {
			if (a[i] != b[j]) {
				count++;
				if (j + 1 == b.length) {
					break;
				}
				if (a[i] == b[j + 1]) {
					j++;
				}
				else {
					i++;
				}
			}
			else {
				i++;
				j++;
			}
		}
		count += (a.length - i);
		count += (b.length - j);
		if (i == a.length) {
			count = b.length - j;
		}
		System.out.println(count);
	}
}
