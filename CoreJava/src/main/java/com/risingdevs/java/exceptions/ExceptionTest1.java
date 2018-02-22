package com.risingdevs.java.exceptions;

public class ExceptionTest1 {

	public static void main(String[] args) {
		m1();
		System.out.println("hello");
	}

	private static void m1() {
		try {
			throw new OutOfMemoryError();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
