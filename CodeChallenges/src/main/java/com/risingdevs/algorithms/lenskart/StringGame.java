package com.risingdevs.algorithms.lenskart;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class StringGame {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		for (int i = 0; i < t; i++) {
			HashSet<String> set = new HashSet<>(Arrays.asList(scr.next().split("")));
			if (set.size() % 2 == 0) {
				System.out.println("Player2");
			}
			else {
				System.out.println("Player1");
			}
		}
		scr.close();
	}
}
