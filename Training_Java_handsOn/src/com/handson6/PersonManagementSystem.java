package com.handson6;

import java.util.*;

class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person[name=" + name + ",address=" + address + "]";
	}
}

class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFree() {
		return fee;
	}

	public void setFree(double fee) {
		this.fee = fee;
	}

	public String toString() {
		return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}

}

class Staff extends Person {

	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
	}
}

public class PersonManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String sname = sc.nextLine();
		System.out.println("Enter Student Address:");
		String saddress = sc.nextLine();
		System.out.println("Enter Program:");
		String program = sc.nextLine();
		System.out.println("Enter Year:");
		int year = sc.nextInt();
		System.out.println("Enter Fee:");
		double fee = sc.nextDouble();
		sc.nextLine();
		Student s = new Student(sname, saddress, program, year, fee);
		System.out.println("\nEnter Staff Name:");
		String stname = sc.nextLine();
		System.out.println("Enter Staff Address:");
		String staddress = sc.nextLine();
		System.out.println("Enter School:");
		String school = sc.nextLine();
		System.out.println("Enter Pay:");
		double pay = sc.nextDouble();
		Staff st = new Staff(stname, staddress, school, pay);
		System.out.println("\nStudent Details:");
		System.out.println(s);
		System.out.println("\nStaff Details:");
		System.out.println(st);
		sc.close();
	}

}
