package com.risingdevs.java.sync;

public class AnnonmusInterface implements test, Cloneable{

	@Override
	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		AnnonmusInterface t = new AnnonmusInterface();
		t.test();
		Object clone = t.clone();
		System.out.println(t + " " + clone);
	}
}

interface test {

	void test();
}
