package com.risingdevs.ds.tree.bst;

import java.lang.management.ManagementPermission;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TNode root = new TNode(1, new TNode(2, new TNode(4), new TNode(5, new TNode(6, null, new TNode(7, null, new TNode(8))), null)),
				new TNode(3, new TNode(9),
						new TNode(10, new TNode(11, null, new TNode(13, new TNode(14, null, new TNode(15)), null)), new TNode(12))));
		/*
		 * System.out.println("In Order");
		 * inOrder(root);
		 * System.out.println();
		 * System.out.println("Level Order");
		 * levelOrder(root);
		 * System.out.println();
		 * System.out.println("Level Order reverse");
		 * levelOrderInReverse(root);
		 * System.out.println();
		 */
		// System.out.println("Spiral Order");
		// zigzag(root);
		// System.out.println();
		System.out.println("Level Order");
		levelOrderN(root);
		// System.out.println("Left view");
		// leftView(root);
		// System.out.println();
		// System.out.println("Right view");
		// rightView(root);
		// System.out.println(findLCA(root, 4, 6));
		// System.out.println(findLCA(root, 4, 10));
//		root = mirror(root);
		System.out.println("Vertical Order");
		verticalOrder(root);
//		levelOrderN(root);
	}

	public static void levelOrderInReverse(TNode root) {
		if (root == null) {
			return;
		}
		Queue<TNode> queue = new LinkedList<TNode>();
		Stack<Integer> stack = new Stack<Integer>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TNode node = queue.poll();
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			stack.push(node.data);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	public static void zigzag(TNode root) {
		if (root == null) {
			return;
		}
		Stack<TNode> s1 = new Stack<TNode>();
		Stack<TNode> s2 = new Stack<TNode>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				TNode node = s1.pop();
				if (node.left != null) {
					s2.push(node.left);
				}
				if (node.right != null) {
					s2.push(node.right);
				}
				System.out.print(node.data + " ");
			}
			System.out.println();
			while (!s2.isEmpty()) {
				TNode node = s2.pop();
				if (node.right != null) {
					s1.push(node.right);
				}
				if (node.left != null) {
					s1.push(node.left);
				}
				System.out.print(node.data + " ");
			}
			System.out.println();
		}
	}

	public static void levelOrder(TNode root) {
		if (root == null) {
			return;
		}
		Queue<TNode> queue = new LinkedList<TNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TNode node = queue.poll();
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			System.out.print(node.data + " ");
		}
		System.out.println();
	}

	public static void levelOrderN(TNode root) {
		if (root == null) {
			return;
		}
		Queue<TNode> queue1 = new LinkedList<TNode>();
		Queue<TNode> queue2 = new LinkedList<TNode>();
		queue1.add(root);
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			while (!queue1.isEmpty()) {
				TNode node = queue1.poll();
				if (node.left != null) {
					queue2.add(node.left);
				}
				if (node.right != null) {
					queue2.add(node.right);
				}
				System.out.print(node.data + " ");
			}
			System.out.println();
			while (!queue2.isEmpty()) {
				TNode node = queue2.poll();
				if (node.left != null) {
					queue1.add(node.left);
				}
				if (node.right != null) {
					queue1.add(node.right);
				}
				System.out.print(node.data + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void leftView(TNode root) {
		if (root == null) {
			return;
		}
		Queue<TNode> queue1 = new LinkedList<TNode>();
		Queue<TNode> queue2 = new LinkedList<TNode>();
		queue1.add(root);
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			if (!queue1.isEmpty()) {
				System.out.print(queue1.peek().data + " ");
			}
			while (!queue1.isEmpty()) {
				TNode node = queue1.poll();
				if (node.left != null) {
					queue2.add(node.left);
				}
				if (node.right != null) {
					queue2.add(node.right);
				}
				// System.out.print(node.data + " ");
			}
			if (!queue2.isEmpty()) {
				System.out.print(queue2.peek().data + " ");
			}
			while (!queue2.isEmpty()) {
				TNode node = queue2.poll();
				if (node.left != null) {
					queue1.add(node.left);
				}
				if (node.right != null) {
					queue1.add(node.right);
				}
				// System.out.print(node.data + " ");
			}
		}
	}

	public static void rightView(TNode root) {
		if (root == null) {
			return;
		}
		Queue<TNode> queue1 = new LinkedList<TNode>();
		Queue<TNode> queue2 = new LinkedList<TNode>();
		queue1.add(root);
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			if (!queue1.isEmpty()) {
				System.out.print(queue1.peek().data + " ");
			}
			while (!queue1.isEmpty()) {
				TNode node = queue1.poll();
				if (node.right != null) {
					queue2.add(node.right);
				}
				if (node.left != null) {
					queue2.add(node.left);
				}
				// System.out.print(node.data + " ");
			}
			if (!queue2.isEmpty()) {
				System.out.print(queue2.peek().data + " ");
			}
			while (!queue2.isEmpty()) {
				TNode node = queue2.poll();
				if (node.right != null) {
					queue1.add(node.right);
				}
				if (node.left != null) {
					queue1.add(node.left);
				}
				// System.out.print(node.data + " ");
			}
		}
	}

	static TNode mirror(TNode node) {
		if (node == null) return node;
		/* do the subtrees */
		TNode left = mirror(node.left);
		TNode right = mirror(node.right);
		/* swap the left and right pointers */
		node.left = right;
		node.right = left;
		return node;
	}

	public static void inOrder(TNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static TNode findLCA(TNode root, int n1, int n2) {
		if (root == null) {
			return null;
		}
		if (root.data == n1 || root.data == n2) {
			return root;
		}
		TNode node1 = findLCA(root.left, n1, n2);
		TNode node2 = findLCA(root.right, n1, n2);
		if (node1 != null && node2 != null) {
			return root;
		}
		return node1 != null ? node1 : node2;
	}

	public static void verticalOrder(TNode root) {
		if (root == null) {
			return;
		}
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		verticalOrder(root, map, 0);
		if (!map.isEmpty()) {
			for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
				for(Integer i:entry.getValue()) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
	}

	public static void verticalOrder(TNode root, Map<Integer, ArrayList<Integer>> map, int level) {
		if (root == null) {
			return;
		}
		verticalOrder(root.left, map, level - 1);
		if (map.containsKey(level)) {
			map.get(level).add(root.data);
		}
		else {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(root.data);
			map.put(level, list);
		}
		verticalOrder(root.right, map, level + 1);
	}
}
