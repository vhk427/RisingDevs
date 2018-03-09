package com.risingdevs.ds.linkedlist.single;

public class StackWithGetMin {

	public static void main(String[] args) {
		StackWithGetMin stack = new StackWithGetMin();
		stack.push(8);
		stack.push(6);
		stack.push(3);
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.min());
		System.out.println(stack.max());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.max());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.max());
		
	}

	Node top = null;

	static class Node {

		int data;
		int min;
		int max;
		Node next;

		public Node(int data, int min, int max) {
			this.data = data;
			this.min = min;
			this.max = max;
		}
	}

	void push(int data) {
		if (top == null) {
			top = new Node(data, data, data);
		}
		else {
			Node node = new Node(data, Math.min(data, top.min), Math.max(data, top.max));
			node.next = top;
			top = node;
		}
	}

	int pop() {
		if (top == null) {
			System.out.println("Stack is empty");
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	int peek() {
		if (top == null) {
			System.out.println("Stack is empty");
		}
		return top.data;
	}

	int min() {
		if (top == null) {
			System.out.println("Stack is empty");
		}
		return top.min;
	}

	int max() {
		if (top == null) {
			System.out.println("Stack is empty");
		}
		return top.max;
	}
}
