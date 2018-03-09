package com.risingdevs.java.serialization.magicmethods.test1;

import java.io.InvalidObjectException;
import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2234702891820447351L;
	String name;

	private void readObjectNoData() throws InvalidObjectException {
		name = "Hemanth";
		System.out.println("readObjectNoData");
	}
}
