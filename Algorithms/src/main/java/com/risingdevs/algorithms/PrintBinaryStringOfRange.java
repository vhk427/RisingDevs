package com.risingdevs.algorithms;

public class PrintBinaryStringOfRange {

	int[] arrays;

	public PrintBinaryStringOfRange(int n) {
		arrays = new int[n];
	}

	public void nBits(int n) {
		if (n <= 0) {
			System.out.print("[");
			for (int a : arrays) {
				if (a >= 'A') {
					System.out.print((char) a + " ");
				}
				else {
					System.out.print(a + " ");
				}
			}
			System.out.println("]");
			return;
		}
		arrays[n - 1] = 0;
		nBits(n - 1);
		arrays[n - 1] = 1;
		nBits(n - 1);
		// un comment for Octal Numbers
		arrays[n - 1] = 2;
		nBits(n - 1);
		arrays[n - 1] = 3;
		nBits(n - 1);
		arrays[n - 1] = 4;
		nBits(n - 1);
		arrays[n - 1] = 5;
		nBits(n - 1);
		arrays[n - 1] = 6;
		nBits(n - 1);
		arrays[n - 1] = 7;
		nBits(n - 1);
		// un comment for Decimal Numbers
		arrays[n - 1] = 8;
		nBits(n - 1);
		arrays[n - 1] = 9;
		nBits(n - 1);
		// un comment for HEXA Decimal Numbers
		arrays[n - 1] = 'A';
		nBits(n - 1);
		arrays[n - 1] = 'B';
		nBits(n - 1);
		arrays[n - 1] = 'C';
		nBits(n - 1);
		arrays[n - 1] = 'D';
		nBits(n - 1);
		arrays[n - 1] = 'E';
		nBits(n - 1);
		arrays[n - 1] = 'F';
		nBits(n - 1);
	}

	public static void main(String[] args) {
		int n = 2;
		PrintBinaryStringOfRange binaryStringOfRange = new PrintBinaryStringOfRange(n);
		binaryStringOfRange.nBits(n);
	}
}
