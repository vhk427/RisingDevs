package com.risingdevs.java.threads.seqnecnce;

public class SequenceGeneratorTest extends Thread {

	SequenceGenerator sg;

	public SequenceGeneratorTest(SequenceGenerator sg, String name) {
		super(name);
		this.sg = sg;
	}

	public static void main(String[] args) throws Exception {
		SequenceGenerator sg = new SequenceGenerator();
		new SequenceGeneratorTest(sg, "ThreadA").start();
		new SequenceGeneratorTest(sg, "ThreadB").start();
		Thread.sleep(2000);
		System.out.println("Next Sequence -> " + sg.getNextSeq());
	}

	@Override
	public void run() {
		long st = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			sg.getNextSeq();
		}
		long et = System.nanoTime();
		System.out.println(this.getName() + " Done in " + (et - st) + " nano secs");
	}
}
