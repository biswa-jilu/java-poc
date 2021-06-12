package com.java8.examples;


@FunctionalInterface
interface A{
	void show();
	
	public default void display() {
		
		System.out.println("m back up ");
	}
	
}
public class BasicsLambda {

	public static void main(String[] args) {
		
		
		A a1 = ()-> {
			
			System.out.println("hello");
			if(1 ==1 ) {
				
				System.out.println("true");
			}
		};
		a1.show();
		
		a1.display();

	}

}
