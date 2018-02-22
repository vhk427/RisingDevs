package com.risingdevs.ds.linkedlist.single;

public class Node {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Node other = (Node) obj;
		if (data != other.data) return false;
		return true;
	}

	public int data;

	@Override
	public String toString() {
		return "Node [" + data + "]";
	}

	public Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
