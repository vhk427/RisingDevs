package com.risingdevs.ds.tree.bst;

public class TNode {

	int data;
	TNode left;
	TNode right;

	public TNode(int data) {
		this.data = data;
	}

	public TNode(int data, TNode left, TNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "TNode [" + data + "]";
	}
}
