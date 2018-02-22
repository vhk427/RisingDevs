package com.risingdevs.java.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableTest {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(15);
		boolean result = ai.compareAndSet(15, 40);
		System.out.println("Result -> " + result + " Value -> " + ai);
		result = ai.compareAndSet(15, 60);
		System.out.println("Result -> " + result + " Value -> " + ai);
	}
}
