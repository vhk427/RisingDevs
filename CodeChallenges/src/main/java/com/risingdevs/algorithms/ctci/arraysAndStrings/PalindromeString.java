package com.risingdevs.algorithms.ctci.arraysAndStrings;

public class PalindromeString {

	static int base = Character.getNumericValue('a');

	public static void main(String[] args) {
		String in = "tactca";
		// building char count array
		int[] count = new int[26];
		for (char c : in.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				count[Character.getNumericValue(c) - base]++;
			}
		}
		// validating odd counts, if more than one - not palindrome
		boolean isOdd = false;
		for (int c : count) {
			if(c%2 == 1) {
				if(isOdd) {
					System.out.println("Not Palindrome");
					System.exit(0);
				}
				isOdd = true;
			}
		}
		System.out.println("Palindrome");
	}
}
