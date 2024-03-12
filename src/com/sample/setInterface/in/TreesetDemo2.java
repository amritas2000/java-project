package com.sample.setInterface.in;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparatorr implements Comparator {
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		//representing object to string
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1>l2) {
			return 1;
		}
		else if(l1<l2) {
			return -1;
		}
		else
			return 0;
	}
}

public class TreesetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TreesetDemo2().f1();

	}
	private  void f1() {
		
		TreeSet obj = new TreeSet(new MyComparatorr());
		
		//get the output in alphabetically increasing order
		obj.add("AAA");
		obj.add("A");
		obj.add("AA");
		obj.add("CCC");
		obj.add("XXX");
		
		
		
		Iterator iterator = obj.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
 
		}

	}
}
