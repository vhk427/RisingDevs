package com.risingdevs.java.threads.reentranctlock;

public class SynchronizedLock implements Runnable {

	private Resource resource;

	public SynchronizedLock(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		synchronized (resource) {
			resource.doAction1();
		}
	}
}
