package com.cg;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem!!!");
		
		Node<Integer> firstNode = new Node<>(70);
    	Node<Integer> secondNode = new Node<>(30);
    	Node<Integer> thirdNode = new Node<>(56);
    	Node<Integer> fourthNode = new Node<>(66);
    	Node<Integer> midNode = new Node<>(42);
    	
    	LinkedList linkedList = new LinkedList();
    	linkedList.add(firstNode);
    	linkedList.add(secondNode);
    	linkedList.add(thirdNode);
    	linkedList.add(fourthNode);
    	
    	linkedList.printLinkedList();
    	
    	linkedList.addMiddle(midNode);
    	linkedList.printLinkedList();
    	
    	linkedList.sortList();
    	linkedList.printLinkedList();
    	
	}
}