package com.controlflow;
import java.util.*;
public class SimpleIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seatAvailable=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Seat Number");
		String number=scan.next();
		if(seatAvailable) {
			System.out.println("You have booked the Seat Number:"+number);
		}
		else {
			System.out.println("Seat Number "+number+" already booked");
		}
		scan.close();

	}

}
