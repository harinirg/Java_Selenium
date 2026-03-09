package com.Assessment14;
import java.util.*;
class Employee {
	int employeeId;
	String name;
	String designation;
	double salary;

	public Employee(int employeeId, String name, String designation, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	void displayInfo() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}

	void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100);
		System.out.println("Salary after percentage increase: " + salary);
	}

	void increaseSalary(double percentage, double bonus) {
		salary = salary + (salary * percentage / 100) + bonus;
		System.out.println("Salary after percentage and bonus: " + salary);
	}
}

public class Problem3_EmployeeAndSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = scan.nextLine();
		System.out.print("Enter Designation: ");
		String designation = scan.nextLine();
		System.out.print("Enter Salary: ");
		double salary = scan.nextDouble();
		Employee emp = new Employee(id, name, designation, salary);
		emp.displayInfo();
		System.out.print("Enter percentage to increase salary: ");
		double percent = scan.nextDouble();
		emp.increaseSalary(percent);
		System.out.print("Enter percentage and bonus: ");
		double p = scan.nextDouble();
		double bonus = scan.nextDouble();
		emp.increaseSalary(p, bonus);
		scan.close();

	}

}
