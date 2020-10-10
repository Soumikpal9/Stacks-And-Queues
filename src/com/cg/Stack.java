package com.cg;

public class Stack {
	private final LinkedList linkedList;
	
	public Stack() {
		this.linkedList = new LinkedList(); 
	}
	
	public void push(INode newNode) {
		linkedList.add(newNode);
	}
	
	public void pop() {
		linkedList.popFirst();
	}
	
	public boolean isEmpty() {
		if(linkedList.head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void popUntilEmpty() {
		while(!isEmpty()) {
			linkedList.popFirst();
		}
	}
	
	public void peak() {
		System.out.println(linkedList.head.getKey());
	}
	
	public void printStack() {
		linkedList.printLinkedList();
	}
}
