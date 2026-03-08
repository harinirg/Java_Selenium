package com.controlflow;
import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         boolean seatAvailable=true;
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the seat Number");
         String SeatNumber=scan.next();
         if(seatAvailable) {
        	 System.out.println("Your have booked the seat "+SeatNumber);
         }
         scan.close();
	}

}
