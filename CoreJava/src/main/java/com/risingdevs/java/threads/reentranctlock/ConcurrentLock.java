package com.risingdevs.java.threads.reentranctlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentLock implements Runnable {

	private Resource resource;
	private Lock lock;

	public ConcurrentLock(Resource resource) {
		this.resource = resource;
		this.lock = new ReentrantLock();
	}

	@Override
	public void run() {
		try {
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				resource.doAction1();
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
}
