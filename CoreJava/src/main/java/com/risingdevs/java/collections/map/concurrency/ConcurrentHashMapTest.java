package com.risingdevs.java.collections.map.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	

	public static void main(String[] args) {
		Object o = new Object();
		ConcurrentHashMap<Integer, Object> map = new ConcurrentHashMap<>();
		map.put(1, o);
		map.put(5, o);
		map.put(4, o);
		map.put(10, o);
		for (int e : map.keySet()) {
			System.out.println(e);
			if (e == 4) {
				map.remove(5);
			}
		}
	}
}
