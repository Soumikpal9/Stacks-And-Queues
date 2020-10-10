package com.cg;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem!!!");
    
		Node<Integer> firstNode = new Node<>(70);
    	Node<Integer> secondNode = new Node<>(30);
    	Node<Integer> thirdNode = new Node<>(56);
    	Node<Integer> fourthNode = new Node<>(66);
    	
    	Stack stack = new Stack();
    	stack.push(firstNode);
    	stack.push(secondNode);
    	stack.push(thirdNode);
    	stack.push(fourthNode);
    	
    	System.out.println("Here is the simple stack implemented by linked list : ");
    	stack.printStack();
    	
    	stack.peak();
    	
    	System.out.println(stack.isEmpty());
    	
    	stack.pop();
    	stack.printStack();
    	
    	stack.popUntilEmpty();
    	stack.printStack();
	}
}