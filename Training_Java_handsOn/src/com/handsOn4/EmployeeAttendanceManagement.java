/*
 *Employee Attendance Management System
 *This program records an employee's check-in and check-out time
 *using Employee and Attendance classes and displays the attendance summary.
 */
package com.handsOn4;
import java.time.LocalTime;
import java.util.*;
class Employee{
	private int empId;
	private String empName;
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	public int getId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	public void markCheckIn(Attendance attendance) {
		 attendance.markCheckIn();
		
	}
	public void markCheckOut(Attendance attendance) {
		 attendance.markCheckOut();
	}
}
class Attendance{
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	Attendance(int empId){
		this.empId=empId;
	
	}
	public void markCheckIn() {
		if(!isCheckedIn) {
			checkInTime=LocalTime.now();
			isCheckedIn=true;
			System.out.println("Employee CheckIn successfully");
		}
		else {
			System.out.println("Employee is already CheckedIn");
		}

	}
	public void markCheckOut() {
		if(!isCheckedOut) {
			checkOutTime=LocalTime.now();
			isCheckedOut=true;
			System.out.println("Employee CheckOut successfully");
		}
		else {
			System.out.println("Employee is already CheckedOut");
		}
	
     }
	public String getAttendanceDetails() {
		//String empName;
		return "empId: "+empId+"\ncheckInTime:"+checkInTime+"\ncheckOutTime: "+checkOutTime;
	}
	
	
	
}
public class EmployeeAttendanceManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"Harini");
		Attendance attendance=new Attendance(emp.getId());
		emp.markCheckIn(attendance);
		emp.markCheckOut(attendance);
		System.out.println("\nAttendance Summary");
		System.out.println(attendance.getAttendanceDetails());
		

	}

}
