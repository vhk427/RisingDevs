package com.risingdevs.servicenow;

import java.util.Scanner;

class PopupWindow {

	public static void main(String args[]) throws Exception {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		for (int i = 0; i < t; i++) {
			int x = scr.nextInt();
			int y = scr.nextInt();
			int l = scr.nextInt();
			int m = scr.nextInt();
			int a = scr.nextInt();
			int b = scr.nextInt();
			printPositions(x, y, l, m, a, y - b);
		}
		scr.close();
	}

	public static void printPositions(int x, int y, int l, int m, int a, int b) {
		String ans = "";
		if (b + m <= y) {
			ans = "bottom";
		}
		else {
			ans = "top";
		}
		if (a + l <= x) {
			ans += "-right";
		}
		else {
			ans += "-left";
		}
		System.out.println(ans);
	}
}
