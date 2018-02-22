package com.risingdevs.algorithms.tg;

public class NCR {

	public static void main(String args[]) throws Exception {
		System.out.println(nCrModp(5, 3, 1000));
		System.out.println(nCrModp(5, 4, 1000));
		System.out.println(nCrModp(5, 5, 1000));
	}

	// Returns nCr % p
	static int nCrModp(int n, int r, int p) {
		int c[] = new int[r + 1];
		c[0] = 1; 
		for (int i = 1; i <= n; i++) {
			for (int j = Math.min(i, r); j > 0; j--)
				c[j] = (c[j] + c[j - 1]) % p;
		}
		return c[r];
	}
}
