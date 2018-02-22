package com.risingdevs.java.threads.seqnecnce;

public class SequenceGenerator {

	volatile private int value = 1;

	public int getNextSeq() {
		return value++;
	}
}
