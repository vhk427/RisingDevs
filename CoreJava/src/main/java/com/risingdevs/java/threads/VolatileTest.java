package com.risingdevs.java.threads;

import java.util.concurrent.TimeUnit;

public class VolatileTest extends Thread {

	private boolean keepRunning = true;

	public void run() {
		while (keepRunning) {
			try {
				VolatileTest.ad();
			}catch (Exception e) {
			}
		}
		System.out.println("Thread terminated.");
	}

	void setter() {
		this.keepRunning = false;
	}

	public static void main(String[] args) throws InterruptedException {
		VolatileTest t = new VolatileTest();
		t.start();
		int i = 0;
		Thread.sleep(1000);
		while (i++ < 1000)
			t.setter();
		System.out.println("keepRunning set to false.");
	}
	static void ad() {
		
	}
}
