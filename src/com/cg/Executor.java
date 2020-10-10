package com.cg;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem!!!");
    
		Node<Integer> firstNode = new Node<>(70);
    	Node<Integer> secondNode = new Node<>(30);
    	Node<Integer> thirdNode = new Node<>(56);
    	Node<Integer> fourthNode = new Node<>(66);
    	
    	Queue queue = new Queue();
    	queue.enqueue(firstNode);
    	queue.enqueue(secondNode);
    	queue.enqueue(thirdNode);
    	queue.enqueue(fourthNode);
    	
    	System.out.println("Here is the simple queue implemented by linked list : ");
    	queue.printQueue();
    	
    	queue.dequeue();
    	queue.printQueue();
	}
}