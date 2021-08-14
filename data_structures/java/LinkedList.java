package com.algos.linkedlist;

public class LinkedList {
	
	private Node head;

	class Node {
		private int data;
		
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertEnd(int data) {
		if(head == null) {
			head = new Node(data);
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = new Node(data);
	}
	
	public void insertFirst(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node currNode = new Node(data);
		currNode.next = head;
		head = currNode;
	}
	
	public void deleteFirst() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is empty!!!");
		}
		Node currNode = head.next;
		head = currNode;
	}
	
	public void deleteLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("LinkedList is empty!!!");
		}
		if(head.next == null) {
			head = null;
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null && currNode.next != null) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = null;
		currNode = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printList() {
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.insertFirst(5);
		ll.insertFirst(2);
		ll.insertFirst(1);
		ll.insertEnd(10);
		ll.insertEnd(15);
		ll.printList();
		ll.deleteFirst();
		ll.deleteLast();
		ll.printList();
	}

}
