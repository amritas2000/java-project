package com.sample.objectDemo.in;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
	
	private void f1() {
		
		Stack s = new Stack();
		//Stack<Integer> s = new Stack<Integer>();
//		Stack<E> stack = new Stack<E>();
//
//		Here E is the type of Object.
		
		for(int i = 0; i< 5; i++) {
			s.push(i);
		}
		
		System.out.println("Size of the Stack is : " + s.size() );
		System.out.println(s);
		System.out.println("Searching element from the top of the stack is : " + s.search(2));
		//System.out.println(s.pop());
		
		for(int i = 0; i< 5; i++) {
			Integer y = (Integer) s.pop();
			 System.out.println(y);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo obj = new StackDemo();
		obj.f1();

	}

}
