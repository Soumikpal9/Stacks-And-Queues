package com.cg;

public class Stack {
	private final LinkedList linkedList;
	
	public Stack() {
		this.linkedList = new LinkedList(); 
	}
	
	public void push(INode newNode) {
		linkedList.add(newNode);
	}
	
	public void printStack() {
		linkedList.printLinkedList();
	}
}
