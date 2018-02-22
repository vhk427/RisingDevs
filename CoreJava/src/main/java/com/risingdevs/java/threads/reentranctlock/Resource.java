package com.risingdevs.java.threads.reentranctlock;
public class Resource {

	public void doAction1() {
		System.out.println("DoAction :" + Thread.currentThread().getName());
		
	}
}