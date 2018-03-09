package com.risingdevs.java.arrays.test;

import java.util.HashMap;
import java.util.Map;

public class SingleTon {

	public static void main(String[] args) {
		Test.map.put("aa", "zz");
		System.out.println(Test.map);
	}
}

class Test {

	public Test() {
		init();
	}

	private void init() {
		map.put("a", "a");
	}

	public static Map<String, String> map = new HashMap<String, String>();
}
