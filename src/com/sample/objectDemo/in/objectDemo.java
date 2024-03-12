package com.sample.objectDemo.in;

public class objectDemo {
	
	public objectDemo() {
		System.out.println("No argument constructor");
	}
	
	public objectDemo(int a) {
		System.out.println("Argument constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		objectDemo obj1 = new objectDemo();
		objectDemo obj2 = new objectDemo();
		
		System.out.println(obj1);
		System.out.println(obj2.toString());
		

	}

}
