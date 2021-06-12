package com.ll.progs;

import com.linklist.prog.LinkListDriver;
import com.linklist.prog.Node;

public class ReverseLinkList {
	
	Node head = null;

	public static void main(String[] args) {

		ReverseLinkList rl = new ReverseLinkList();
		
		Node node1 = new Node(2, null);
		Node node2 = new Node(3, null);
		Node node3 = new Node(4, null);
		node1.setNext(node2);
		node2.setNext(node3);
		
		rl.head=node1;

		reverseLinkList(rl);
		
		printList(rl);

	}

	/**
	 * 
	 * @param rl
	 */
	private static void printList(ReverseLinkList rl) {
		Node head = rl.head;
		while(head!=null) {
			
			System.out.println(head.getData());
			head=head.getNext();
		}
	}

	/**
	 * 
	 * @param rl
	 */
	private static void reverseLinkList(ReverseLinkList rl) {
		
		Node prevNode = null;
		
		Node currNode = rl.head;
		Node nextNode = null;
		
		while(currNode!=null) {  
			if(currNode!=null) {
				nextNode = currNode.getNext();
				currNode.setNext(prevNode);
				prevNode = currNode;
				currNode = nextNode;
				
			}
			
		}
		rl.head=prevNode;
	}

}
