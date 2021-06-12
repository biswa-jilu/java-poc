package com.linklist.prog;

public class LinkListDriver {
	
	public Node head = null;

	public static void main(String[] args) {
		
		LinkListDriver ld = new LinkListDriver();  // 2-3-4
		
		Node node1 = new Node(2, null);
		Node node2 = new Node(3, null);
		Node node3 = new Node(4, null);
		node1.setNext(node2);
		node2.setNext(node3);
		ld.head=node1;
		
		insertAtHead(7,ld.head,ld);
		insertAfter(3,5,ld.head,ld);
		
		//TODO
		
		insertBefore(3,5,ld.head,ld); // 7-2-5-3-4-
		insertAtTail(10,ld.head,ld);// 7-2-5-3-4-10
		remove(3,ld.head,ld);
		
		//TODO
		iterateLinkList(ld);
	}

	/**
	 * 
	 * @param i
	 * @param head2
	 * @param ld
	 */
	private static void insertAtTail(int i, Node head2, LinkListDriver ld) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param i
	 * @param head2
	 * @param ld
	 */
	private static void remove(int i, Node head2, LinkListDriver ld) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param i
	 * @param j
	 * @param head2
	 * @param ld
	 */
	private static void insertBefore(int i, int j, Node head2, LinkListDriver ld) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param i
	 * @param j
	 */
	private static void insertAfter(int afterData, int tragetData,Node head,LinkListDriver ld) {
		
		Node primaryNode = ld.head;
		
		while(primaryNode.getNext()!=null) {
			if(primaryNode.getData()==afterData) {
				primaryNode.setNext(new Node(tragetData, primaryNode.getNext()));
			}
			
			primaryNode = primaryNode.getNext();
		}
	}

	/**
	 * 
	 * @param data
	 * @param head2
	 * @param ld
	 */
	public static void insertAtHead(int data, Node head2,LinkListDriver ld) {
		
		Node newData = new Node(data, null);
		Node tempNode = ld.head ;
		ld.head = newData;
		newData.setNext(tempNode);
		 
		
	}

	public static void iterateLinkList(LinkListDriver ld) {
		Node primaryNode = ld.head;
		while(primaryNode.getNext()!=null) {
			System.out.println(primaryNode.getData());
			primaryNode = primaryNode.getNext();
		}
		System.out.println(primaryNode.getData());
		System.out.println("head node is "+ld.head.getData());
	}

	
	
}
