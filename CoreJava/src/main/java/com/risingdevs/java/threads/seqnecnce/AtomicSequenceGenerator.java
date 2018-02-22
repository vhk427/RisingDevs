package com.risingdevs.java.threads.seqnecnce;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSequenceGenerator {

	private AtomicInteger value = new AtomicInteger(0);

	public int getNextSeq() {
		return value.incrementAndGet();
	}
}
