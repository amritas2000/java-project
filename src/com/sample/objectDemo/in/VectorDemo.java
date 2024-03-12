package com.sample.objectDemo.in;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
	
	private void f1() {
		
		Vector v = new Vector();
		
		for(int i = 10; i<20; i++) {
			v.add(i);
		}
		for(int j = 0; j < v.size(); j++) {
			System.out.println(v.get(j));
		}
		System.out.println("The hashCode value is: "
                + v.hashCode()); 
		
		System.out.println(v.getClass().getName());
		
		//convert vector to Arraylist
		ArrayList al = new ArrayList();
		System.out.println(al.getClass().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VectorDemo obj = new VectorDemo();
		obj.f1();

	}

}
