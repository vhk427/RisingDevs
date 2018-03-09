package com.risingdevs.algorithms.strings;

public class StringToDouble {

	public static void main(String[] args) {
		System.out.println(stringToDouble("-1000.00000"));
	}

	public static double stringToDouble(String str) {
		if (str == null || str.length() < 1) return 0;
		// trim white spaces
		str = str.trim();
		char flag = '+';
		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		}
		else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
		// calculate value
		// multiplier
		boolean decimal = false;
		int m = 0;
		while (str.length() > i) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				if (decimal) {
					result += (str.charAt(i) - '0') * Math.pow(10, --m);
				}
				else {
					result = result * 10 + (str.charAt(i) - '0');
				}
			}
			else if (str.charAt(i) == '.') {
				decimal = true;
			}
			else {
				throw new IllegalArgumentException("String [" + str + "] contains unexpected character other than + - . 0-9");
			}
			i++;
		}
		if (flag == '-') result = -result;
		return result;
	}
}
