package com.risingdevs.java.arrays;

public class ArrayStoreExceptionTest {

	public static void main(String[] args) {
		Object[] names = new String[3];
		names[0] = new Integer(0);
	}
}
