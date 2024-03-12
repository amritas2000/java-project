package com.sample.objectDemo.in;

import java.util.LinkedList;

public class LinkedListDemo {
	private void f1() {
		LinkedList l1 = new LinkedList();
		for(int i = 0; i<=10; i++) {
			l1.add(i);
		}
		System.out.println(l1.size());
		System.out.println("retriving objects from linked list: " );
		for (int i = 0; i< l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		l1.addFirst(90);
		l1.addLast(30);
		
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		
		System.out.println(l1);
		
		for(int i=0;i<l1.size();i++) {
			
			//explicit 
			
			Integer i1 = (Integer) l1.get(i);
			System.out.println(i1*i1);
			
			
		    }
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo obj = new LinkedListDemo();
		obj.f1();
		

	}

}
