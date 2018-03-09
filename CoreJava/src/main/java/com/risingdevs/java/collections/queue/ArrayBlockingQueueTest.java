package com.risingdevs.java.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueTest {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10000000);
		queue.add(1);
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
