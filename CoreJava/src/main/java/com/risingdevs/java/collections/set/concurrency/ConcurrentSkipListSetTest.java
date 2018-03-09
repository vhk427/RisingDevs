package com.risingdevs.java.collections.set.concurrency;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetTest {

	public static void main(String[] args) {
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(10);
		set.add(8);
		for (int e : set) {
			System.out.println(e);
			if(e == 8) {
				set.remove(10);
			}
		}
	}
}
