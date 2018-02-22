package com.risingdevs.algorithms.lenskart;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class TestClass {

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void call() {
		StringBuilder sb = new StringBuilder();
		for (int T = nextInt(); T > 0; T--) {
			int n = nextInt();
			int[] a = nextArray(n);
			solve(a, n, sb);
		}
		System.out.print(sb.toString());
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		call();
	}

	public static void main(String[] args) throws Exception {
		new TestClass().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1) throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			}
			catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0) return -1;
		}
		return inbuf[ptrbuf++];
	}

	private int[] nextArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	private int nextInt() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			}
			else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	public static void solve(int[] a, int n, StringBuilder sb) {
		int max = Integer.MIN_VALUE;
		int min = a[0];
		for (int i = 1; i < n; i++) {
			min = Math.min(min, a[i]);
		}
		for (int i = 1; i < n; i++) {
			max = Math.max(max, a[i] - min);
		}
		sb.append(max);
		sb.append("\n");
	}
}
