package com.handsOn3;
import java.util.*;
public class M3OverTimePay {

	// TODO Auto-generated method stub
	static int calculateOvertimePay(int hoursWorked) {
		int overtimePay = 0;

		if (hoursWorked > 40) {
			int overtimeHours = hoursWorked - 40;
			overtimePay = overtimeHours * 15;
		}

		return overtimePay;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter hours worked by employee " + i + ":");
			int hours = scan.nextInt();

			int pay = calculateOvertimePay(hours);
			System.out.println("Overtime pay for employee " + i + " is Rs." + pay);
			System.out.println();


		}
		scan.close();

	}
}

