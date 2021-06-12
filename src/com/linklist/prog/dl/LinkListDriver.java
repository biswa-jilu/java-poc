package com.linklist.prog.dl;

public class LinkListDriver {
	
	 Node head = null;

	public static void main(String[] args) {
		
		LinkListDriver ld = new LinkListDriver();  // 2-3-4
		
		Node node1 = new Node(2, null,null);
		Node node2 = new Node(3, null,null);
		Node node3 = new Node(4, null,null);
		
		ld.head=node1;
		
		//assign 
		node1.setNext(node2);
		node2.setNext(node3);
		
		node2.setPrev(node1);
		node3.setPrev(node2);
		
		//printEachNode(ld);
		
		insertAtMiddle(2,5,ld);
		
		//printEachNode(ld);
		
		insertAthead(10,ld);
		printEachNode(ld);
		
		insertAtTail(11,ld);
		printEachNode(ld); // 10 - 2-5-3-4
		
		deleteAfter(ld,2);
		printEachNode(ld); 
	}

	/**
	 * 
	 * @param ld
	 * @param i
	 */
	private static void deleteAfter(LinkListDriver ld, int data) {
		
		Node currNode  = ld.head;
		Node tempNode = new Node(data, null, null);
		
		while(currNode!=null) {
			
			if(tempNode.getData()==currNode.getData()) {
				
				Node nextNode = currNode.getNext().getNext();
				currNode.setNext(nextNode);
				nextNode.setPrev(tempNode);
				
			}
			
			currNode = currNode.getNext();
		}
		
	}

	/**
	 * 
	 * @param i
	 * @param ld
	 */
	private static void insertAtTail(int i, LinkListDriver ld) {
		// TODO Auto-generated method stub
		
	}

	public static void insertAthead(int targetData, LinkListDriver ld) {
		
		Node prevHead = ld.head;
		Node targetDataNode = new Node(targetData, null, null);
		
		ld.head=targetDataNode;
		ld.head.setNext(prevHead);
		
	}

	public static void insertAtMiddle(int prevDataNode, int targetData, LinkListDriver ld) {
		
		Node head = ld.head;
		Node tempNode = head;
		Node targetDataNode = new Node(targetData, null, null);
		
		while(tempNode.getNext()!=null) {
			
			if(tempNode.getData()==prevDataNode) {
				Node temoNode = tempNode.getNext();
				tempNode.setNext(targetDataNode);
				targetDataNode.setNext(temoNode);
			}
			
			tempNode= tempNode.getNext();
		}
			
		
	}

	/**
	 * 
	 * @param ld
	 */
	private static void printEachNode(LinkListDriver ld) {
		
		Node head = ld.head;
		Node tempNode = head;
		while(tempNode.getNext()!=null) {
			System.out.println(tempNode.getData());
			tempNode= tempNode.getNext();
		}
			
			System.out.println(tempNode.getData());
		
		
	}

	
	
	
}
