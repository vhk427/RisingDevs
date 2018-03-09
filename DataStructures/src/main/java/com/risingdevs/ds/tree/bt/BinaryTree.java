package com.risingdevs.ds.tree.bt;

import java.util.Stack;

public class BinaryTree {

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			return "TNode [" + data + "]";
		}
	}

	public static void main(String[] args) {
	}

	static int size(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}

	static int depth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(size(root.left), size(root.right));
	}

	static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		Node node = root;
		// first node to be visited will be the left one
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
		// traverse the tree
		while (stack.size() > 0) {
			// visit the top node
			node = stack.pop();
			System.out.print(node.data + " ");
			if (node.right != null) {
				node = node.right;
				// the next node to be visited is the leftmost
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
	}

	static void inOrderR(Node root) {
		if (root == null) {
			return;
		}
		inOrderR(root.left);
		System.out.print(root.data + " ");
		inOrderR(root.right);
	}

	static void preOrderR(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderR(root.left);
		preOrderR(root.right);
	}

	static void postOrderR(Node root) {
		if (root == null) {
			return;
		}
		postOrderR(root.left);
		postOrderR(root.right);
		System.out.print(root.data + " ");
	}

	static boolean hasPathSum(Node root, int sum) {
		if (root == null) {
			return sum == 0;
		}
		sum -= root.data;
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}

	static void printAllPaths(Node root) {
		int[] path = new int[1000];
		printAllPaths(root, path, 0);
	}

	static void printAllPaths(Node root, int[] path, int id) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			printArray(path, id);
			return;
		}
		path[id++] = root.data;
		printAllPaths(root.left, path, id);
		printAllPaths(root.right, path, id);
	}

	private static void printArray(int[] path, int id) {
		for (int i = 0; i <= id; i++) {
			System.out.println(path[i] + " ");
		}
		System.out.println();
	}

	public static void mirror(Node root) {
		if (root == null) {
			return;
		}
		mirror(root.left);
		mirror(root.right);
		Node t = root.left;
		root.left = root.right;
		root.right = t;
	}

	public static void doubleTree(Node root) {
		if (root == null) {
			return;
		}
		doubleTree(root.left);
		doubleTree(root.right);
		Node t = root.left;
		root.left = new Node(root.data);
		root.left.left = t;
	}

	public static boolean sameTree(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
	}

	public static boolean isBST(Node root) {
		return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	public static boolean isBST(Node root, int max, int min) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		boolean left = isBST(root.left, root.data, min);
		if (!left) {
			return isBST(root.right, max, root.data + 1);
		}
		return left;
	}
}
