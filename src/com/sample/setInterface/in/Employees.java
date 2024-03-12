
package com.sample.setInterface.in;

public class Employees {
	
	private Integer employeeId;
	private String employeeName;
	 
	public Employees(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
			
	}
	public Employees() {
		
	}
	@Override
	public String toString() {
		return "employee ID :" + employeeId + " Employee Name:" + employeeName;
	}
	 

	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	

}
