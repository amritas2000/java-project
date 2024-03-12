package com.sample.objectDemo.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner si = new Scanner(System.in);

		List<Integer> cl = new ArrayList<>();
		List<String> al = new ArrayList<>();

		System.out.println("Enter the name of the account user");
		al.add(si.nextLine());
		System.out.println("Enter the amount you want to deposit in your account");
		cl.add(si.nextInt());
		si.nextLine();
		

	}

}
