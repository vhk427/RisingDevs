package com.risingdevs.java.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	static CountDownLatch latch;

	public static void main(String[] args) throws InterruptedException {
		latch = new CountDownLatch(3);
		new WorkerLocal().start();
		System.out.println(latch.getCount());
		new WorkerLocal().start();
		System.out.println(latch.getCount());
		new WorkerLocal().start();
		System.out.println(latch.getCount());
		System.out.println("count down reached to 0");
		Thread.sleep(1000);
		new WorkerLocal().start();
		new WorkerLocal().start();
		new WorkerLocal().start();
	}
}

class WorkerLocal extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Let's play.");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		CountDownLatchTest.latch.countDown();
	}
}
