package com.risingdevs.java.threads.reentranctlock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicbarrierTest extends Thread{
	static CyclicBarrier barrier = new CyclicBarrier(3);
	
	@Override
	public void run() {
		System.out.println("Hello");
		try {
			barrier.await();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println("World");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new CyclicbarrierTest().start();
		new CyclicbarrierTest().start();
		Thread.sleep(1000);
		new CyclicbarrierTest().start();
		
	}
}
