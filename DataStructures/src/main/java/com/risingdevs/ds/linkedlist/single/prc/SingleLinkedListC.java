package com.risingdevs.ds.linkedlist.single.prc;

public class SingleLinkedListC {

	Node head;

	void detectLoopAndRemove() {
		if (head == null || head.next == null) {
			return;
		}
		Node fast = head.next.next;
		Node slow = head.next;
		while (fast != null && fast.next != null) {
			if (fast.data == slow.data) {
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast == null || fast.next == null) {
			System.out.println("No Loop Detected");
			return;
		}
		slow = head;
		while (fast.next.data != slow.next.data) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println("Loop Detected, At :" + slow.data);
		fast.next = null;
	}

	void reverse() {
		if (head == null || head.next == null) {
			return;
		}
		Node prev = null;
		Node cur = head;
		Node next = cur.next;
		while (cur.next != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			next = next.next;
		}
		cur.next = prev;
		head = cur;
	}

	void reverseRecursion() {
		if (head == null || head.next == null) {
			return;
		}
		head = revereRecuHelper(head, null);
	}

	private Node revereRecuHelper(Node cur, Node prev) {
		if (cur.next == null) {
			head = cur;
			cur.next = prev;
			return null;
		}
		Node next = cur.next;
		cur.next = prev;
		revereRecuHelper(next, cur);
		return head;
	}

	boolean delete(int data) {
		if (head == null) {
			return false;
		}
		if (head.data == data) {
			head = head.next;
			return true;
		}
		Node node = head;
		while (node.next != null) {
			if (node.next.data == data) {
				node.next = node.next.next;
				return true;
			}
			node = node.next;
		}
		return false;
	}

	boolean search(int data) {
		if (head == null) {
			return false;
		}
		Node node = head;
		while (node != null) {
			if (node.data == data) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	void insertAtStart(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	void insert(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(data);
	}

	void print() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	boolean swap(int d1, int d2) {
		if (head == null) {
			System.out.println("List is empty");
			return false;
		}
		if (d1 == d2) {
			System.out.println("Both are same");
			return true;
		}
		boolean x = false, y = false;
		Node curx = head, prevx = null, cury = head, prevy = null;
		while (curx != null && cury != null && (!x || !y)) {
			if (!x) {
				if (curx.data == d1) {
					x = true;
				}
				else {
					prevx = curx;
					curx = curx.next;
				}
			}
			if (!y) {
				if (cury.data == d2) {
					y = true;
				}
				else {
					prevy = cury;
					cury = cury.next;
				}
			}
		}
		if (!x) {
			System.out.println("unable to find d1," + d1);
			return false;
		}
		if (!y) {
			System.out.println("unable to find d2," + d2);
			return false;
		}
		// If x is not head of linked list
		if (prevx != null)
			prevx.next = cury;
		else // make y the new head
			head = cury;
		// If y is not head of linked list
		if (prevy != null)
			prevy.next = curx;
		else // make x the new head
			head = curx;
		Node temp = curx.next;
		curx.next = cury.next;
		cury.next = temp;
		return true;
	}

	void nthNodeFromLast(int n) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node node = head;
		Node itr = head;
		int count = 0;
		while (itr != null && count < n) {
			count++;
			itr = itr.next;
		}
		if (count != n) {
			System.out.println("List is shorter, Size :" + count);
			return;
		}
		while (itr != null) {
			node = node.next;
			itr = itr.next;
		}
		System.out.println("Nth Position from last is : " + node.data);
	}
}
