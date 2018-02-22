package com.risingdevs.servicenow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int m = scr.nextInt();
		int t = scr.nextInt();
		int c = scr.nextInt();
		Map<Integer, List<Integer>> nodes = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < m; i++) {
			int u = scr.nextInt();
			int v = scr.nextInt();
			if (!nodes.containsKey(u)) {
				nodes.put(u, new ArrayList<Integer>(n - 1));
			}
			nodes.get(u).add(v);
			
			if (!nodes.containsKey(v)) {
				nodes.put(v, new ArrayList<Integer>(n - 1));
			}
			nodes.get(v).add(u);
		}
		int x = scr.nextInt();
		int y = scr.nextInt();
		scr.close();
		List<Integer> directions = getDirections(x, y, nodes);
		if (directions == null || directions.isEmpty()) {
			return;
		}
		System.out.println(directions.size());
		for (Integer i : directions) {
			System.out.print(i + " ");
		}
	}

	public static List<Integer> getDirections(int start, int finish, Map<Integer, List<Integer>> nodes) {
		Map<Integer, Boolean> vis = new HashMap<Integer, Boolean>();
		Map<Integer, Integer> prev = new HashMap<Integer, Integer>();
		List<Integer> directions = new LinkedList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		int current = start;
		q.add(current);
		vis.put(current, true);
		while (!q.isEmpty()) {
			current = q.remove();
			if (current == finish) {
				break;
			}
			else {
				for (int node : nodes.get(current)) {
					if (!vis.containsKey(node)) {
						q.add(node);
						vis.put(node, true);
						prev.put(node, current);
					}
				}
			}
		}
		if (current != finish) {
			return null;
		}
		for (Integer node = finish; node != null; node = prev.get(node)) {
			directions.add(node);
		}
		Collections.reverse(directions);
		return directions;
	}
}
