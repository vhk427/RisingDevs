package com.risingdevs.java.inheritance;

class A {

	public int calculate(int a, int b) {
		return 1;
	}
	
//	final public int calculate(int a, int b) {
//		return 1;
//	}
	
	// public int calculate(int a, int b) ;
	
	//final abstract public int calculate(int a, int b) ;
}

class B extends A {

	public int calculate(int a, int b) {
		return 2;
	}
}

public class FinalKeyWordTest {

	public static void main(String args[]) {
		B b = new B();
		System.out.print("b is " + b.calculate(0, 1));
	}
}
