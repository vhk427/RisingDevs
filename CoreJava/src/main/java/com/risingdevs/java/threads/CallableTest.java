package com.risingdevs.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	private static final int NTHREDS = 50000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		for (int i = 0; i < 100000; i++) {
			Callable<Long> worker = new MyCallable();
			Future<Long> submit = executor.submit(worker);
			list.add(submit);
		}
		long sum = 0;
		System.out.println(list.size());
		// now retrieve the result
		for (Future<Long> future : list) {
			try {
				sum += future.get();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println(sum);
		executor.shutdown();
		System.out.println("Total time:" + (System.currentTimeMillis() - start));
	}
}

class MyCallable implements Callable<Long> {

	static long num = 1;

	@Override
	public Long call() throws Exception {
		System.out.println("in call");
		return num++;
	}
}
