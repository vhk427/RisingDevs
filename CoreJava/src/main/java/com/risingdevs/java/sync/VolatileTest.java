package com.risingdevs.java.sync;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {

	private static AtomicInteger MY_INT = new AtomicInteger(0);

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeListener extends Thread {

		@Override
		public void run() {
			int local_value = MY_INT.get();
			while (local_value < 5) {
				if (local_value != MY_INT.get()) {
					System.out.println("Got Change for MY_INT : " + MY_INT);
					local_value = MY_INT.get();
				}
			}
		}
	}

	static class ChangeMaker extends Thread {

		@Override
		public void run() {
			while (MY_INT.get() < 5) {
				System.out.println("Incrementing MY_INT to : " + (MY_INT.incrementAndGet()));
				try {
					Thread.sleep(500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
