package com.risingdevs.algorithms.sort;

import com.risingdevs.algorithms.ArraysUtil;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = { 38, 27, 43, 3, 9,11, 10, 27, 82, 10 };
		sort(a, new int[a.length], 0, a.length - 1);
		ArraysUtil.printArray(a);
	}

	public static void sort(int[] a, int[] aux, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(a, aux, l, m);
			sort(a, aux, m + 1, r);
			merge(a, aux, l, m, r);
		}
	}

	private static void merge(int[] a, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		// creating temp arrays
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
		// copying data to temp arrays
		for (int i = 0; i < n1; ++i)
			a1[i] = a[l + i];
		for (int j = 0; j < n2; ++j)
			a2[j] = a[m + 1 + j];
		// start merging
		int k = l;
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (a1[i] < a2[j]) {
				a[k++] = a1[i++];
			}
			else {
				a[k++] = a2[j++];
			}
		}
		while (i < n1) {
			a[k++] = a1[i++];
		}
		while (j < n2) {
			a[k++] = a2[j++];
		}
	}

	private static void merge(int[] a, int[] aux, int l, int m, int r) {
		// copying data to temp array
		for (int i = l; i <= r; ++i)
			aux[i] = a[i];
		// start merging
		int k = l;
		int i = l, j = m + 1;
		while (i <= m && j <= r) {
			if (aux[i] < aux[j]) {
				a[k++] = aux[i++];
			}
			else {
				a[k++] = aux[j++];
			}
		}
		while (i <= m) {
			a[k++] = aux[i++];
		}
		while (j <= r) {
			a[k++] = aux[j++];
		}
	}
}
