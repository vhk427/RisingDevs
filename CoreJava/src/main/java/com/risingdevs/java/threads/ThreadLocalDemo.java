package com.risingdevs.java.threads;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalDemo implements Runnable {

	static long value = 0;
	// SimpleDateFormat is not thread-safe
	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {

		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};

	@Override
	public void run() {
		value++;
		try {
			Thread.sleep(value*100);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		if ((value % 2) == 0) {
			formatter.set(new SimpleDateFormat());
		}
		System.out.println("Formatter for Thread " + Thread.currentThread().getName() + " is " + formatter.get().toPattern());
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalDemo obj = new ThreadLocalDemo();
		for (int i = 0; i < 20; i++) {
			Thread t = new Thread(obj, "" + i);
			Thread.sleep(new Random().nextInt(1000));
			t.start();
		}
	}
}
