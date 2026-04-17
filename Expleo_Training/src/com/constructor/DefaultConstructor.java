package com.constructor;

class Employee {
	int empId;
	String empName;

	Employee() {
		empId = 1111;
		empName = "AAA-BBB";

	}

	void getEmployeeDetails() {
		System.out.println("The Initial value ofemployee id is: " + empId);
		System.out.println("The Initial value ofemployee name is: " + empName);
	}

}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.getEmployeeDetails();

	}

}
