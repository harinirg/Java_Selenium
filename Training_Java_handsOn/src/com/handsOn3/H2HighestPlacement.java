/*
 * Program to find the department with the highest number of placements using a separate function
 */
package com.handsOn3;
import java.util.*;
public class H2HighestPlacement {
		static void checkHighestPlacement(int cs, int ec, int me) {

	        if (cs < 0 || ec < 0 || me < 0) {
	            System.out.println("Input is Invalid");
	            return;
	        }

	        if (cs == ec && ec == me) {
	            System.out.println("None of the department has got the highest placement");
	            return;
	        }

	        int max = cs;
	        if (ec > max)
	            max = ec;
	        if (me > max)
	            max = me;

	        System.out.print("Highest placement ");
	        if (cs == max)
	            System.out.print("CS ");
	        if (ec == max)
	            System.out.print("EC ");
	        if (me == max)
	            System.out.print("ME ");
	    }

	    public static void main(String[] args) {

			// TODO Auto-generated method stub

	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the no of students placed in CS:");
	        int cs = scan.nextInt();

	        System.out.print("Enter the no of students placed in EC:");
	        int ec = scan.nextInt();

	        System.out.print("Enter the no of students placed in ME:");
	        int me = scan.nextInt();

	        checkHighestPlacement(cs, ec, me);

	}

}
