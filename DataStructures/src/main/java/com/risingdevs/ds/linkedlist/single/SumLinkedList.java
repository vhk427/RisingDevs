package com.risingdevs.ds.linkedlist.single;


public class SumLinkedList {

	public static void main(String[] args) {
		Node head1 = new Node(7);
		head1.next = new Node(1);
		head1.next.next = new Node(6);
		Node head2 = new Node(5);
		head2.next = new Node(9);
		head2.next.next = new Node(2);
		int sum = sumLists(head1, head2);
		System.out.println("SUM: " + sum);
		Node head = prepareListFromSum(sum);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static Node prepareListFromSum(int sum) {
		Node node = null;
		Node head = null;
		while (sum != 0) {
			int num = sum % 10;
			if (head == null) {
				node = new Node(num);
				head = node;
			} else {
				node.next =  new Node(num);
				node = node.next;
			}
			sum = sum / 10;
		}
		return head;
	}

	private static int sumLists(Node head1, Node head2) {
		int sum1 = Integer.valueOf(getSum(head1));
		System.out.println(sum1);
		int sum2 = Integer.valueOf(getSum(head2));
		System.out.println(sum2);
		return sum1 + sum2;
	}

	static String getSum(Node node) {
		if (node == null) {
			return "";
		}
		return getSum(node.next) + node.data + "";
	}
}
