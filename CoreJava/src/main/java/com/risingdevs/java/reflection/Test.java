package com.risingdevs.java.reflection;

class Simple {

	void message() {
		System.out.println("Hello Java");
	}
}

public class Test {

	public static void main(String args[]) {
		try {
			Class c = Class.forName("com.risingdevs.threads.reflection.Simple");
			Simple s = (Simple) c.newInstance();
			s.message();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
