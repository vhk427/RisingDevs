package com.risingdevs.java.threads.reentranctlock;

public class LockClient {

	public static void main(String[] args) throws InterruptedException {
		Resource resource = new Resource();
		SynchronizedLock sLock1 = new SynchronizedLock(resource);
		Thread t1 = new Thread(sLock1);
		Thread t2 = new Thread(sLock1);
		ConcurrentLock cLock1 = new ConcurrentLock(resource);
		Thread t3 = new Thread(cLock1);
		Thread t4 = new Thread(cLock1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
