package com.cg;

public class Queue {
	private final LinkedList linkedList;
	
	public Queue() {
		this.linkedList = new LinkedList();
	}
	
	public void enqueue(INode newNode) {
		linkedList.append(newNode);
	}
	
	public void printQueue() {
		linkedList.printLinkedList();
	}
}
