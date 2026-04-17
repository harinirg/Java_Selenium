package com.handson8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class InvalidEmpNumberException extends Exception {
	public InvalidEmpNumberException(String message) {
		super(message);
	}
}

class InvalidDateOfJoinException extends Exception {
	public InvalidDateOfJoinException(String message) {
		super(message);
	}
}

class Employee {

	int empCode;
	String name;
	LocalDate dob;
	LocalDate appointmentDate;

	public Employee(int empCode, String name, LocalDate dob, LocalDate appointmentDate) {
		this.empCode = empCode;
		this.name = name;
		this.dob = dob;
		this.appointmentDate = appointmentDate;
	}

	public void display() {

		int experience = Period.between(appointmentDate, LocalDate.now()).getYears();

		System.out.println("\nEmployee Details");
		System.out.println("Employee Code : " + empCode);
		System.out.println("Employee Name : " + name);
		System.out.println("Date of Birth : " + dob);
		System.out.println("Date of Appointment : " + appointmentDate);
		System.out.println("Years of Experience : " + experience);
	}
}

public class P3EmployeeValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter Employee Code: ");
			int empCode = sc.nextInt();

			if (empCode <= 0) {
				throw new InvalidEmpNumberException("Employee code must be positive");
			}

			sc.nextLine();

			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
			LocalDate dob = LocalDate.parse(sc.nextLine());

			System.out.print("Enter Date of Appointment (YYYY-MM-DD): ");
			LocalDate appointmentDate = LocalDate.parse(sc.nextLine());

			if (!dob.isBefore(appointmentDate)) {
				throw new InvalidDateOfJoinException("Date of birth must be before appointment date");
			}

			Employee emp = new Employee(empCode, name, dob, appointmentDate);

			emp.display();

		} catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
			System.out.println(e.getMessage());
		}
	}
}
