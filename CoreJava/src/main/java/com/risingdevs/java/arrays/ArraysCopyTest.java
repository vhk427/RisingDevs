package com.risingdevs.java.arrays;

import java.util.Arrays;

public class ArraysCopyTest {
	public static void main(String[] args) {
		char c[] = {'h', 'e', 'm', 'a', 'n', 't', 'h', 'k', 'u', 'm', 'a', 'r'};
		char d[]  = new char[5];
		System.arraycopy(c, 7, d, 0, 5);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		int x = 0;
		x =+1;
		System.out.println(x);
	}
	
	public void ArraysCopyTest() {
		
	}
}
