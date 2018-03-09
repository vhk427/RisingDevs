package com.risingdevs.java.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		producer.start();
		consumer.start();
	}

	static class Producer extends Thread {

		BlockingQueue<Integer> queue;

		public Producer(BlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			for (int i = 1; i < 20; i = i + 2) {
				try {
					produce(i);
					sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private void produce(int i) {
			synchronized (queue) {
				try {
					queue.put(i);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				queue.notify();
			}
		}
	}

	static class Consumer extends Thread {

		BlockingQueue<Integer> queue;

		public Consumer(BlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			for (int i = 1; i < 20; i = i + 2) {
				try {
					consume(i);
					sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private void consume(int i) {
			synchronized (queue) {
				try {
					System.out.println(queue.take());
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
