package com.sample.objectDemo.in;

import java.util.ArrayList;

public class CapgeminiMailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("asingh12@gmail.com");
		list.add("Sonaliss34@capgemini.com");
		list.add("sonakshi34@capgemini.com");
		list.add("viveksingh44@gmail.com");
		
		System.out.println("ArrayList are : " + list);
		
		for(int i = 0; i<list.size(); i++) {
			
			String result = list.get(i);
			if(!result.contains("@capgemini.com")) {
				list.remove(i);
			}
			
		}
		System.out.println("ArrayList are : " + list);

	}

}
