package com.ClassesandObject;
public class StaticMethodDemo {
	private static int totalseats=20;
	StaticMethodDemo(){
		System.out.println("Current Seat Availabaility: "+totalseats);
	}
	public void DisplayTheatreScreen() {
		System.out.println("Current Seat Availability: "+totalseats);
	}
	public static void BookTicket(int nooftickets) {
		System.out.println("No.of Seats Booked: "+nooftickets);
		totalseats-=nooftickets;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Screen Ticket Availability Status: ");
		StaticMethodDemo SM1=new StaticMethodDemo();
		SM1.BookTicket(4);
		StaticMethodDemo SM2=new StaticMethodDemo();
		SM1.BookTicket(5);
		SM2.DisplayTheatreScreen();
	}
}
