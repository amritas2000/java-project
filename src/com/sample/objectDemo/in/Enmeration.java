package com.sample.objectDemo.in;

import java.util.Enumeration;
import java.util.Stack;

public class Enmeration {
private void f1() {
		
		Stack s = new Stack();
		
		for(int i = 1; i<= 5; i++) {
			s.push(i);
			System.out.println(s);
		
		
		}
		//cursor means to retrieve the objects one by one from collection  
		Enumeration obj = s.elements();
		while(obj.hasMoreElements()) {
			System.out.println(obj.nextElement());
		}
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enmeration ob = new Enmeration();
		ob.f1();

	}

}
