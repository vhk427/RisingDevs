package com.risingdevs.java.threads;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumerTest2 {

	static LinkedList<Integer> list = new LinkedList<>();;
	static volatile AtomicInteger id = new AtomicInteger();

	public static void main(String[] args) {
		Producer producer = new Producer(list);
		Consumer consumer = new Consumer(list);
		producer.start();
		consumer.start();
	}

	static class Producer extends Thread {

		LinkedList<Integer> list;

		public Producer(LinkedList<Integer> list) {
			this.list = list;
		}

		@Override
		public void run() {
			try {
				produce();
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void produce() throws InterruptedException {
			int i = 0;
			while (i <= 10) {
				synchronized (list) {
					while (!list.isEmpty()) {
						list.wait();
					}
					i = id.incrementAndGet();
					list.addFirst(i);
					Thread.sleep(100);
					list.notify();
				}
			}
		}
	}

	static class Consumer extends Thread {

		LinkedList<Integer> list;

		public Consumer(LinkedList<Integer> list) {
			this.list = list;
		}

		@Override
		public void run() {
			try {
				consume();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		private void consume() throws InterruptedException {
			int id = 0;
			while (id <= 10) {
				synchronized (list) {
					while (list.isEmpty()) {
						list.wait();
					}
					id = list.removeFirst();
					System.out.println(id);
					list.notify();
				}
			}
		}
	}
}
