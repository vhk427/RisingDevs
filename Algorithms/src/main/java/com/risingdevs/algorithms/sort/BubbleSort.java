package com.risingdevs.algorithms.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = new int[] { 4, 5, 7, 8, 2, 3, 1 };
		bubbleSort(a);
		print(a);
		a = new int[] { 4, 5, 7, 8, 2, 3, 1 };
		insertionSort(a);
		print(a);
		a = new int[] { 4, 5, 7, 8, 2, 3, 1 };
		selectionSort(a);
		print(a);
		a = new int[] { 4, 5, 7, 8, 2, 3, 1 };
		mergeSort(a, 0, a.length-1);
		print(a);
	}

	public static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			merge(a, l, m, r);
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

	public static void selectionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int k = 0;
			int min = Integer.MAX_VALUE;
			for (int j = i; j < n; j++) {
				if (min > a[j]) {
					min = a[j];
					k = j;
				}
			}
			int temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
	}

	public static void bubbleSort(int[] a) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 1; i < a.length; i++) {
				if (a[i - 1] > a[i]) {
					int temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
					swap = true;
				}
			}
		}
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int k = a[i];
			while (j >= 0 && k < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = k;
		}
	}
}
