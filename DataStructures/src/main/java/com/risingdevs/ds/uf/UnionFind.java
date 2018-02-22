package com.risingdevs.ds.uf;

import java.util.Scanner;

public class UnionFind {

	int a[] = null;
	int n = 0;

	public UnionFind(int n) {
		this.n = n;
		this.a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
	}

	public boolean isConnected(int i, int j) {
		return a[i] == a[j];
	}

	public void union(int p, int q) {
		int pid = a[p];
		int qid = a[q];
		for (int i = 0; i < n; i++) {
			if (a[i] == pid) {
				a[i] = qid;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 10;
		int t = 7;
		UnionFind uf = new UnionFind(n);
		uf.union(1, 2);
		uf.union(3, 4);
		uf.union(5, 6);
		uf.union(0, 5);
		uf.union(7, 8);
		uf.union(7, 9);
		uf.union(8, 2);
		uf.union(1, 9);
		// finding connection status
		System.out.println(uf.isConnected(5, 4));
	}
}
