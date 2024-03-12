package com.sample.objectDemo.in;

import java.util.ArrayList;

public class capgeminiMail {
	
	public void gmail() {
		
	
	ArrayList list = new ArrayList();
	
	list.add("asingh12@gmail.com");
	list.add("Sonaliss34@capgemini.com");
	list.add("sonakshi34@capgemini.com");
	list.add("viveksingh44@gmail.com");
	
	System.out.println("ArrayLust are :" + list);
	
	String result = "capgemini.com";
	for(int i = 0;i<list.size(); i++) {
		String a = (String) list.get(i);
		if(a.contains(result)) {
			System.out.println("New ArrayList are : " + list.get(i));
		}
		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capgeminiMail obj = new capgeminiMail();
		obj.gmail();
		
		

	}

}
