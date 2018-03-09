package com.risingdevs.ds.linkedlist.single.prc;

public class SingleLinkedTest {

	public static void main(String[] args) {
		// insertTest();
		// insertAtFirstTest();
		// deleteTest();
		// nthNodeFromLastTest();
		// swapNodes();
		// reverseTest();
		detectLoopAndRemove();
	}

	public static void detectLoopAndRemove() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.head.next.next.next.next.next.next.next = new Node(8);
//		list.head.next.next.next.next.next.next.next.next = list.head.next.next.next.next;
		list.detectLoopAndRemove();
		list.print();
	}

	public static void reverseTest() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.print();
		list.reverse();
		list.print();
		list.reverseRecursion();
		list.print();
	}

	public static void swapNodes() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.print();
		list.swap(1, 7);
		list.print();
		list.swap(2, 4);
		list.print();
	}

	public static void nthNodeFromLastTest() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.print();
		list.nthNodeFromLast(1);
		list.nthNodeFromLast(7);
		list.nthNodeFromLast(2);
		list.nthNodeFromLast(8);
	}

	public static void deleteTest() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		// list.insert(4);
		list.print();
		list.delete(4);
		list.print();
		list.delete(2);
		list.print();
	}

	public static void insertTest() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(4);
		list.print();
	}

	public static void insertAtFirstTest() {
		SingleLinkedListC list = new SingleLinkedListC();
		list.insert(1);
		list.insertAtStart(2);
		list.insertAtStart(3);
		list.insertAtStart(4);
		list.print();
	}
}
