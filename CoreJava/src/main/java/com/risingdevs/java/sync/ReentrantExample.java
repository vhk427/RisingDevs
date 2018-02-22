package com.risingdevs.java.sync;

public class ReentrantExample {

	public static void main(String args[]) {
		final Reentrant re = new Reentrant();
		Thread t1 = new Thread() {

			public void run() {
				re.m();// calling method of Reentrant class
			}
		};
		t1.start();
	}
}

class Reentrant {

	public synchronized void m() {
		n();
		System.out.println("this is m() method");
	}

	public synchronized void n() {
//		m();
		System.out.println("this is n() method");
	}
}
