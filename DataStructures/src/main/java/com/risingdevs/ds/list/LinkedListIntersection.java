package com.risingdevs.ds.list;

public class LinkedListIntersection {

	public static void main(String[] args) {
		Node nodes = new Node(5);
		nodes.next = new Node(6);
		nodes.next.next = new Node(7);
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
//		head1.next.next.next.next = nodes;
		Node node = head1;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
		Node head2 = new Node(8);
		head2.next = new Node(9);
		head2.next.next = nodes;
		node = head2;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
		findIntersection(head1, head2);
	}

	private static void findIntersection(Node head1, Node head2) {
		int len1 = 0;
		Node node = head1;
		while (node != null) {
			node = node.next;
			len1++;
		}
		int len2 = 0;
		node = head2;
		while (node != null) {
			node = node.next;
			len2++;
		}
		Node node1 = head1;
		Node node2 = head2;
		int diff = 0;
		if (len1 > len2) {
			diff = len1 - len2;
			while (diff > 0) {
				node1 = node1.next;
				diff--;
			}
		}
		else {
			diff = len2 - len1;
			while (diff > 0) {
				node2 = node2.next;
				diff--;
			}
		}
		while (node1 != null) {
			if (node1.data == node2.data) {
				System.out.println(node1.data);
				break;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		if (node1 == null) {
			System.out.println("lists dont have intersection");
		}
	}
}
