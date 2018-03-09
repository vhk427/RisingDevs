package com.risingdevs.algorithms.arrays.mislanious;

public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 1, 2, 3, 4 };
		System.out.println(findMin(a));
	}

	static public int findMin(int[] num) {
		return findMin(num, 0, num.length - 1);
	}

	static public int findMin(int[] num, int left, int right) {
		if (left == right) {
			return num[left];
		}
		if ((right - left) == 1) {
			return Math.min(num[left], num[right]);
		}
		int middle = left + (right - left) / 2;
		// not rotated
		if (num[left] < num[right]) {
			return num[left];
			// go right side
		}
		if (num[middle] > num[left]) {
			return findMin(num, middle, right);
			// go left side
		}
		return findMin(num, left, middle);
	}
}
