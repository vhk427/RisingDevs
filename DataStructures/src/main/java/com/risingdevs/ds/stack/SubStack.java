package com.risingdevs.ds.stack;

import java.util.HashMap;
import java.util.Map;

public class SubStack {

	Map<Integer, int[]> stacks = new HashMap<Integer, int[]>();
	int[] s = null;
	int size = 0;
	int subStacks;
	int currStack = -1;

	SubStack(int subStacks, int size) {
		s = new int[subStacks];
		this.subStacks = subStacks;
		this.size = size;
	}

	void push(int data) {
		if (currStack == subStacks - 1 && s[currStack] == size) {
			throw new IllegalAccessError("All stacks full");
		}
		if (currStack == -1 || s[currStack] == size) {
			currStack++;
			stacks.put(currStack, new int[size]);
		}
		stacks.get(currStack)[s[currStack]++] = data;
	}

	int pop() {
		if (currStack == -1) {
			throw new IllegalAccessError("stacks empty");
		}
		if (s[currStack] == 0) {
			currStack--;
		}
		if (currStack == -1) {
			throw new IllegalAccessError("stacks empty");
		}
		int data = stacks.get(currStack)[s[currStack]-- - 1];
		if (s[currStack] == 0) {
			currStack--;
		}
		return data;
	}

	int popAtSubStack(int index) {
		if (index < 0 || index > subStacks) {
			throw new IllegalAccessError("Index[" + index + "] invalid");
		}
		index--;
		if (currStack == -1) {
			throw new IllegalAccessError("stacks empty");
		}
		if (s[index] == 0) {
			throw new IllegalAccessError("indexed substack is empty");
		}
		int data = stacks.get(index)[s[index]-- - 1];
		return data;
	}

	public static void main(String[] args) {
		SubStack stack = new SubStack(2, 2);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.popAtSubStack(1));
		System.out.println(stack.popAtSubStack(1));
//		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
