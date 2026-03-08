/**
 * This program displays the calendar for a given month.
 * It reads the month number and the starting day of the month.
 *
 * For February, the user is prompted to enter 28 or 29 days.
 * If the month number is outside the range [1, 12],
 * the program terminates.
 */
package com.handsOn1;
import java.util.*;
public class M5CalendarDisplay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter month number");
			int month = scan.nextInt();
			if (month < 1 || month > 12) {
				break;
			}
			System.out.println("Enter starting day:");
			int startDay = scan.nextInt();
			int days = 0;
			if (month == 2) {
				System.out.println("Enter number of days:");
				days = scan.nextInt();
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				days = 30;
			} else {
				days = 31;
			}
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			for (int i = 1; i < startDay; i++) {
				System.out.print("    ");
			}
			for (int date = 1; date <= days; date++) {
				System.out.printf("%3d ",date);
				if ((date + startDay - 1) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println("\n");
		}
		scan.close();
	}
}

