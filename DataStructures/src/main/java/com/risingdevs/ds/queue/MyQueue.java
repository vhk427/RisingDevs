package com.risingdevs.ds.queue;

import java.util.Stack;

public class MyQueue {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	void enqueue(int data) {
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack1.push(data);
	}

	int dequeue() {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
}
