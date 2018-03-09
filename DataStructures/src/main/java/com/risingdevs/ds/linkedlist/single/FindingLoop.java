package com.risingdevs.ds.linkedlist.single;

public class FindingLoop {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		Node node = new Node(5);
		head.next.next.next.next = node;
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = node;
		findLoop(head);
	}

	private static void findLoop(Node head) {
		if (head == null || head.next == null || head.next.next == null) {
			System.out.println("List is empty");
			return;
		}
		Node fast = head.next.next;
		Node slow = head.next;
		while (fast != null && fast.next != null && fast.next.next != null) {
			if (slow.data == fast.data) {
				System.out.println("have loop");
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		// checking whether loop is theere or not
		if (fast == null || fast.next == null) {
			System.out.println("Don't have loop");
			return;
		}
		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(fast.next.data);
		// removing loop
		fast.next = null;
		print(head);
	}

	public static void print(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		print(node.next);
	}
}
