package com.constructor;

class Employee1{
	int empId;
	String empName;

	Employee1() {
		empId = 0;
		empName = "AAA-BBB";
	}

	Employee1(int id, String name) {
		empId = 1111;
		empName = name;
	}

	void getEmployeeDetails() {
		System.out.println("Employee id is: " + empId);
		System.out.println("Employee name is:" + empName);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp0 = new Employee1();
		Employee1 emp1 = new Employee1(1001, "Ram Kumar");
		emp0.getEmployeeDetails();
		emp1.getEmployeeDetails();

	}

}
