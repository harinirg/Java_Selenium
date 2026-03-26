package com.ClassesandObject;

class Employee1 {
	int empId;
	String empName;

	void setEmployeeDetail(int id, String name) {
		empId = id;
		empName = name;
	}

	void getEmployeeDetail() {
		System.out.println("Employee id : " + empId);
		System.out.println("Employee name : " + empName);
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee1 Emp1 = new Employee1();
		Employee1 Emp2 = new Employee1();
		Emp1.setEmployeeDetail(1001, "RAM");
		Emp2.setEmployeeDetail(1002, "RAJ");
		Emp1.getEmployeeDetail();
		Emp2.getEmployeeDetail();
	}

}
