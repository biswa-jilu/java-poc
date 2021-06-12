package com.stack.prog;

import java.util.Stack;

import com.linklist.prog.LinkListDriver;
import com.linklist.prog.Node;

public class OwnStackUsingLinkList {

	int[] arr = new int[10];
	int popIndex = -1;
	
	int fullLength = -1;
	public static void main(String[] args) {
		LinkListDriver ld = new LinkListDriver();
		
		OwnStackUsingLinkList stackDriver = new OwnStackUsingLinkList();
		stackDriver.push(10,ld);
		stackDriver.push(20,ld);
		stackDriver.print(ld);
		
		stackDriver.pop(ld);
		stackDriver.push(30,ld);
		stackDriver.push(40,ld);
		stackDriver.print(ld);
		
		stackDriver.pop(ld);
		
		stackDriver.print(ld);
	}
	
	/**
	 * 
	 * @param i
	 * @param ld
	 */
	private void pop( LinkListDriver ld) {

		if(ld.head!=null) {
			
			Node nextHead = ld.head.getNext();
			System.out.println("popp  "+ld.head.getData());
			
			ld.head=nextHead;
		}
		
	}

	/**
	 * 
	 */
	private void print(LinkListDriver ld) {
		
		LinkListDriver.iterateLinkList(ld);
		
	}
	/**
	 * 
	 * @param i
	 */
	private void push(int data,LinkListDriver ld) {
		LinkListDriver.insertAtHead(data, null, ld);
	}
	
	

}
