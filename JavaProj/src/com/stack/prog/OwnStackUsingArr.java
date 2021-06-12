package com.stack.prog;

import java.util.Stack;

public class OwnStackUsingArr {

	int[] arr = new int[10];
	int popIndex = -1;
	
	int fullLength = -1;
	public static void main(String[] args) {
		OwnStackUsingArr st = new OwnStackUsingArr();
		push(st,10);
		
		printWholeStack(st);
		push(st,20);
		push(st,30);
		printWholeStack(st);
		pop(st);
		
		printWholeStack(st);
		
		pop(st);
		
		printWholeStack(st);
		
		
	
	}
	
	/**
	 * 
	 * @param st
	 */
	private static void printWholeStack(OwnStackUsingArr st) {
		int index=st.fullLength; // 0
		int currIndex = -1;
		while(currIndex!=index) {
			System.out.println("printing.........."+st.arr[++currIndex]);
		}
		
		
	}

	/**
	 * 
	 * @param st
	 */
	private static void pop(OwnStackUsingArr st) {

		int poppedEmnt = st.arr[st.popIndex];
		System.out.println("pop last element"+poppedEmnt);
		st.popIndex = st.popIndex-1;
		st.fullLength--;
		
		
	}

	/**
	 * @param i 
	 * @param st 
	 * 
	 */
	private static void push(OwnStackUsingArr st, int data) {
		st.arr[++st.fullLength] = data;
		st.popIndex++;
		System.out.println("pushing to stack"+st.arr[st.fullLength]);
	}
	

}
