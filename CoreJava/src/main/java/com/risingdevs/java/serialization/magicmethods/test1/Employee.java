package com.risingdevs.java.serialization.magicmethods.test1;

import java.io.Serializable;

public class Employee extends Person {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -103635404525847913L;
	int salary;
	String empid;
}
