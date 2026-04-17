/**
 * This program calculates the bill amount for a job work.
 * Typing is charged at Rs. 3 per page.
 * Printing is charged at Rs. 1 per page for the first copy
 * and Rs. 3 per page for each additional copy.
 * The calculation is done using if-else statements.
 */
package com.handsOn1;
import java.util.*;
public class M3BillGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of page:");
		int page = scan.nextInt();
		System.out.println("Enter number of copy:");
		int copy = scan.nextInt();
		int typecost = page * 3;
		int printingcost = 0;
		if (copy >= 1) {
			printingcost = page * 1;

			if (copy> 1) {
				printingcost = printingcost + (copy - 1) * page * 3;
			}
		}
		int totalbill = typecost + printingcost;
		System.out.println("Total Bill: Rs. " + totalbill);

		scan.close();
	}

}
