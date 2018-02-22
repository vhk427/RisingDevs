package com.risingdevs.ds.tree.bst;

public class BinarySearchTree {

	TNode root = null;

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new TNode(20);
		tree.root.left = new TNode(15, new TNode(10), new TNode(18, new TNode(16), new TNode(19)));
		tree.root.right = new TNode(25);
		System.out.println(tree.find(10));
		System.out.println(tree.find(15));
		System.out.println(tree.find(8));
		System.out.println("IN Order");
		tree.display();
		System.out.println("PRE Order");
		tree.printPreOrder();
		System.out.println("POST Order");
		tree.printPostOrder();
		System.out.println("Height: " + tree.getHeight(tree.root));
		// finding height of node, if 0 not found
		System.out.println("Height of node [4]:" + tree.getHeightOfNode(19));
		System.out.println("Height of node [20]:" + tree.getHeightOfNode(20));
		System.out.println("Height of node [25]:" + tree.getHeightOfNode(25));
		System.out.println("Height of node [18]:" + tree.getHeightOfNode(18));
		System.out.println("Height of node [60]:" + tree.getHeightOfNode(60));
		// isBST
		System.out.println("is BST:" + tree.isBST(tree.root));
		// checking balanced or not
		System.out.println("Is Balanced:" + tree.isBalanced(tree.root));
		System.out.println("Is Balanced:" + tree.checkBalance(tree.root));
	}

	boolean isBalanced(TNode root) {
		if (root == null) {
			return true;
		}
		int heightdifference = getHeight(root.left) - getHeight(root.right);
		if (Math.abs(heightdifference) > 1) {
			return false;
		}
		else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}

	boolean isBST(TNode root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean isBST(TNode node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		}
		return (isBST(node.left, min, node.data - 1) && isBST(node.right, node.data + 1, max));
	}

	public boolean checkBalance(TNode root) {
		int result = isBalancedPostOrder(root);
		if (result > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int isBalancedPostOrder(TNode root) {
		if (root == null) {
			return 0;
		}
		int leftH = isBalancedPostOrder(root.left);
		if (leftH == -1) {
			return -1;
		}
		int rightH = isBalancedPostOrder(root.right);
		if (rightH == -1) {
			return -1;
		}
		int diff = leftH - rightH;
		if (Math.abs(diff) > 1) {
			return -1;
		}
		return 1 + Math.max(leftH, rightH);
	}

	boolean find(int data) {
		TNode node = root;
		if (node == null) {
			return false;
		}
		while (node != null) {
			if (node.data == data) {
				return true;
			}
			if (data > node.data) {
				node = node.right;
			}
			else {
				node = node.left;
			}
		}
		return false;
	}

	void display() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(TNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void printPreOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(TNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void printPostOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(TNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	int getHeight(TNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

	int getHeightOfNode(int data) {
		return getHeightOFNode(root, data, 0);
	}

	int getHeightOFNode(TNode node, int data, int height) {
		if (node == null) {
			return 0;
		}
		if (node.data == data) {
			return height + 1;
		}
		int h = getHeightOFNode(node.left, data, height + 1);
		if (h != 0) {
			return h;
		}
		return getHeightOFNode(node.right, data, height + 1);
	}

	void insert(int id) {
		TNode newNode = new TNode(id);
		if (root == null) {
			root = newNode;
			return;
		}
		TNode current = root;
		TNode parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			}
			else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	boolean completeBT() {
		return false;
	}
}
