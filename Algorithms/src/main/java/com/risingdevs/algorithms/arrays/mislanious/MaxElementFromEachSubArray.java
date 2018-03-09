package com.risingdevs.algorithms.arrays.mislanious;

import java.util.Arrays;
import java.util.LinkedList;

public class MaxElementFromEachSubArray {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 5, 3, 1, 2 };
		System.out.println(Arrays.toString(maxElementsFromArray(a, 4)));
	}

	static int[] maxElementsFromArray(int[] a, int k) {
		int n = a.length;
		int r[] = new int[n - k + 1];
		int ri = 0;
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			// remove all useless elements present at the front of the list
			while (!list.isEmpty() && a[list.getLast()] < a[i]) {
				list.removeLast();
			}
			// add index of current element at the back
			list.addLast(i);
		}
		for (int i = k; i < n; i++) {
			// first element present in the list is the greatest element for the last 'k' sized sub-array
			r[ri++] = a[list.getFirst()];
			// now remove all indices of elements from the list which do not belong to current window
			while (!list.isEmpty() && (list.getFirst() < (i - k + 1))) {
				list.removeFirst();
			}
			// now again remove all useless elements present at the front of the list
			// remove all useless elements present at the front of the list
			while (!list.isEmpty() && a[list.getLast()] < a[i]) {
				list.removeLast();
			}
			// and finally insert this new element at the back of the list
			list.add(i);
		}
		r[ri++] = a[list.getFirst()];
		return r;
	}
}
