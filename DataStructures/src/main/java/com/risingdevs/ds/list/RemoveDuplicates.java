package com.risingdevs.ds.list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static Node removeDuplicates(Node head) {
		Node node = head;
		if (node == null || node.next == null) {
			return node;
		}
		Set<Integer> set = new HashSet<Integer>();
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
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
	}
}
