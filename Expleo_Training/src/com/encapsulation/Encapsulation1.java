package com.encapsulation;

class Employee {
	private int _empId;
	private String _empName;

	public void setId(int id) {
		_empId = id;
	}

	public void setName(String name) {
		_empName = name;
	}

	public int getId() {
		return _empId;
	}

	public String getName() {
		return _empName;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Ram Kumar");
		System.out.println("Employee Id: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());

	}

}
