package com.risingdevs.algorithms.monocept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int q = scr.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(FactorsOfNumber(scr.nextInt()));
		}
		Collections.sort(list);
		for (int i = 0; i < q; i++) {
			int ans = 0;
			int k = scr.nextInt();
			for(Integer count : list) {
				k -=count;
				if(k <0) {
					break;
				}
				ans++;
			}
			System.out.println(ans);
		}
		scr.close();
	}

	public static int FactorsOfNumber(int num) {
		int count = 0;
		while (num > 1) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count++;
					num = num / i;
					break;
				}
			}
		}
		return count;
	}
}
