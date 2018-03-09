package com.risingdevs.java.sync;

public class TestSync {

	public static synchronized void m1() {
		System.out.println("M1");
		m2();
	}

	public static synchronized void m2() {
		System.out.println("M2");
	}
	
	public static void main(String[] args) {
		m1();
	}
	
}
