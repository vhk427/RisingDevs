package com.risingdevs.algorithms.tg;

import java.util.Scanner;

public class CandidateCode {

	public static void main(String args[]) throws Exception {
		Scanner scr = new Scanner(System.in);
		int m = scr.nextInt();
		int n = scr.nextInt();
		int[][] matrix = new int[m][n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scr.nextInt();
				k = Math.max(k, matrix[i][j]);
			}
		}
		k++;
		int p = scr.nextInt();
		int[] count = new int[k];
		scr.close();
		for (int i = 0; i < m; i++) {
			for (int j = matrix[i][0]; j <= matrix[i][1]; j++) {
				count[j]++;
			}
		}
		int q1 = 0;
		int q2 = -1;
		for (int i = 0; i < k; i++) {
			q1 = Math.max(q1, count[i]);
			if (p == count[i]) {
				q2 = i;
			}
		}
		System.out.println(q1 + " " + q2);
	}
}
