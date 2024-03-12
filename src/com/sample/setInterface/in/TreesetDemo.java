package com.sample.setInterface.in;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparator implements Comparator {
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		Employees emp1 = (Employees) obj1;
		Employees emp2 = (Employees) obj2;
		
		Integer eid1 = emp1.getEmployeeId();
		Integer eid2 = emp2.getEmployeeId();
		//return (eid1 < eid2) ? 1 : (eid1 > eid2) ? -1 : 0;
		
		
		// Q2. Get the output according to alphabetically order
		String empN1 = emp1.getEmployeeName();
		String empn2 = emp2.getEmployeeName();
		return(empN1.compareTo(empn2));
		
		
		
		
	}
}

public class TreesetDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TreesetDemo().f1();

	}

	private  void f1() {
		TreeSet obj = new TreeSet(new MyComparator());
		
		obj.add(new Employees(1,"Pranav"));
		obj.add(new Employees(2,"Amrita"));
		obj.add(new Employees(3,"Sonali"));
		obj.add(new Employees(4,"Mamali"));
		obj.add(new Employees(5,"Sonu"));
		obj.add(new Employees(6,"Amrita"));
		
		Iterator iterator = obj.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
 
		}
	
	}

}
