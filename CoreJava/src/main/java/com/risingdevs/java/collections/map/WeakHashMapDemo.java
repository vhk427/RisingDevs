package com.risingdevs.java.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Employee> map = new HashMap<>();
		Employee emp = new Employee();
		map.put("hemanth", emp);
		emp = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(map);
	}
}

class Employee <T extends Runnable>{
	@Override
	public String toString() {
		return "Hello ";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
		super.finalize();
	}
	
	private void m1(List<?> l) {
//		l.add(10);
//		l.add("hemanth");
	}
}
