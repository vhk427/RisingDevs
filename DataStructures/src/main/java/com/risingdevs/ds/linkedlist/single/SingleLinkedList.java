package com.risingdevs.ds.linkedlist.single;


public class SingleLinkedList {
	Node head = null;
	
	void add(int data) {
		Node node = head;
		while(node != null) {
			node = node.next;
		}
		node.next = new Node();
	}
}
