package com.risingdevs.algorithms.ctci.arraysAndStrings;

public class URLifyString {

	public static void main(String[] args) {
		String s = "Mr John Smith    ";
		int len = s.length();
		int act = 0;
		// finding actual String length
		for (int i = len - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				act = i + 1;
				break;
			}
		}
		if (len == act) {
			System.out.println(s);
			return;
		}
		// finding space availability for %20 insertion
		int count = 0;
		for (int i = 0; i < act; i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		int diff = len - act;
		if(diff != count *2 ) {
			System.out.println("Length is not enough to convert URL");
			return;
		}
		char[] out = s.toCharArray();
		// converting spaces
		for (int i = act-1; i > 0; i--) {
			if(out[i] == ' ') {
				out[--len] = '0';
				out[--len] = '2';
				out[--len] = '%';
			} else {
				out[--len] = out[i];
			}
		}
		System.out.println(new String(out));
	}
}
