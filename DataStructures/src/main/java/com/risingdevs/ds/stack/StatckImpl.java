package com.risingdevs.ds.stack;

public class StatckImpl<T extends Comparable<? super T>> {

	int size;
	T stack[] = null;
	T min[] = null;
	T max[] = null;
	int top = 0;

	@SuppressWarnings("unchecked")
	StatckImpl(int size) {
		this.stack = (T[]) new Object[size];
		this.max = (T[]) new Object[size];
		this.min = (T[]) new Object[size];
		this.size = size;
	}

	void push(T data) {
		if (top == size) {
			throw new IllegalAccessError("Stack is full");
		}
		stack[top++] = data;
		if (top == 0) {
			min[top] = data;
			max[top] = data;
		}
		else {
			if (min[top - 1].compareTo(data) <= 0) {
				min[top] = data;
			}
			else {
				min[top] = min[top - 1];
			}
			if (max[top - 1].compareTo(data) >= 0) {
				max[top] = data;
			}
			else {
				max[top] = max[top - 1];
			}
		}
	}

	T pop() {
		if (top == 0) {
			throw new IllegalAccessError("Stack is empty");
		}
		T data = stack[top];
		stack[top] = null;
		max[top] = null;
		min[top] = null;
		top--;
		return data;
	}

	T peek() {
		if (top == 0) {
			throw new IllegalAccessError("Stack is empty");
		}
		return stack[top];
	}

	T min() {
		if (top == 0) {
			throw new IllegalAccessError("Stack is empty");
		}
		return min[top];
	}

	T max() {
		if (top == 0) {
			throw new IllegalAccessError("Stack is empty");
		}
		return max[top];
	}

	public static void main(String[] args) {
		StatckImpl<Integer> stack = new StatckImpl<Integer>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(20);
		stack.push(100);
		stack.push(10);
		stack.push(5);
	}
}
