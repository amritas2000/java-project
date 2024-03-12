package com.sample.objectDemo.in;

import java.util.ArrayList;

public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Amrita");
		al.add("chunu");
		al.add("chunu");
		al.add("Swati");
		al.add("subu");
		al.add("Rina");
		
		System.out.println("ArrayList are :" + al);	
		
		ArrayList<String> result = new ArrayList<>();
		for(String e : al) {
			
			if(!result.contains(e)) {
				result.add(e);
			}
			
		}
		System.out.println("New ArrayList are :" + result);
		

	}

}
