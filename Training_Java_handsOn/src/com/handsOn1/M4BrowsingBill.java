/**
 * This program calculates the Internet browsing bill.
 * Charges are Rs. 50 for 1 hour, Rs. 1 per minute,
 * and Rs. 200 for 5 hours.
 *
 * The user is allowed to browse for a maximum of 7 hours.
 */

package com.handsOn1;
import java.util.*;
public class M4BrowsingBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hours used:");
        int hours = scan.nextInt();
        System.out.println("Enter minutes used:");
        int minutes = scan.nextInt();
        if (hours > 7) {
            System.out.println("Browsing limit exceeded");
        } else {
            int bill;
            if (hours == 5 && minutes == 0) {
                bill = 200;
            } else {
                bill = (hours * 50) + (minutes * 1);
            }
            System.out.println("Bill:Rs." + bill);
        }
        scan.close();
    }
}
