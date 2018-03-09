package com.risingdevs.ds.linkedlist.single;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDS {

	@Override
	public String toString() {
		if (head == null) {
			return "";
		}
		Node node = head;
		StringBuffer sb = new StringBuffer();
		while (node != null) {
			sb.append(node.data + " ");
			node = node.next;
		}
		return sb.toString();
	}

	private Node head;

	public static void main(String[] args) {
		LinkedListDS ll = new LinkedListDS();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.insert(7);
		System.out.println(ll);
		ll.printKthToLast(6);
	}

	int size() {
		if (head == null) {
			return 0;
		}
		int s = 0;
		Node node = head;
		while (node != null) {
			s++;
			node = node.next;
		}
		return s;
	}

	/**
	 * Using two pointers
	 * 
	 */
	void removeduplicates() {
		if (head == null || head.next == null) {
			return;
		}
		Node slow = head;
		Node fast = head;
		while (slow.next != null) {
			fast = slow;
			while (fast.next != null) {
				if (slow.data == fast.next.data) {
					fast.next = fast.next.next;
				}
				else {
					fast = fast.next;
				}
			}
			slow = slow.next;
		}
	}

	/**
	 * Using two hashset
	 * 
	 */
	void removeDuplicatesSet() {
		if (head == null || head.next == null) {
			return;
		}
		Set<Integer> set = new HashSet<Integer>();
		Node node = head;
		set.add(node.data);
		while (node.next != null) {
			if (set.contains(node.next.data)) {
				node.next = node.next.next;
			}
			else {
				set.add(node.next.data);
				node = node.next;
			}
		}
	}

	void printKthToLast(int k) {
		Node node1 = head;
		Node node2 = head;
		for (int i = 0; i < k; i++) {
			if (node1.next == null) {
				System.out.println("list size not greaterthan k");
				return;
			}
			node1 = node1.next;
		}
		while (node1.next != null) {
			node1 = node1.next;
			node2 = node2.next;
		}
		System.out.println(node2.data);
	}

	void delete(int data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
		}
		Node node = head;
		while (node.next != null) {
			if (node.next.data == data) {
				node.next = node.next.next;
				return;
			}
			node = node.next;
		}
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

	void insert(int data, int index) {
	}
}
