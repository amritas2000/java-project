package com.sample.objectDemo.in;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override    //Overriden the toString method with our own implementation
	public String toString() {
		return this.employeeId+ " " + this.employeeName;
	}
	
	@Override
	public int hashCode() {
		return this.employeeId;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Employee emp = (Employee)obj;
//		try {
//			if(this.employeeId ==)
//		}
//		return false;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee(67686947, "Amrita");
		Employee obj2 = new Employee(67686947, "Ams");
		Employee obj3 = new Employee(67686947, "Tubu");
		Employee emp = obj1;
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);
		
		
		String city = new String("Banglore");
		System.out.println(city);
		
		System.out.println("HashCode of emp1 " + obj1.hashCode());
		System.out.println("HashCode of emp1 " + emp.hashCode());
		
		System.out.println(obj1.equals(null));
		System.out.println(obj1.equals(emp));
		

	}

}
