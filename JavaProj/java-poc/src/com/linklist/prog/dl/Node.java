package com.linklist.prog.dl;

public class Node {
	
	int data;
	Node next;
	Node prev;
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	
	Node(int data,Node next,Node prev){
		this.data=data;
		this.next=next;
		this.prev=prev;
	}

}
