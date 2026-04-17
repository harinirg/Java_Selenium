/**
 * This illustrate the multidimensional array through the movie seat 
 */
package com.Array;

public class MovieSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seat[][]=new String[][] {{"B","B","A","A","A"},{"A","A","A","B","B"},{"A","B","B","B","B"},{"B","A","A","B","A"}};
		int vipCount=0,premiumCount=0,regularCount=0,vipTotal=5,premiumTotal=10,regularTotal=5;
		System.out.println("        Movie Details        ");
		for(int i=0;i<seat.length;i++) {
			if(i==0) {
				System.out.println("--------VIP Seat--------");
			}
			else if(i==1) {
				System.out.println("--------Premium Seat--------");
			}
			else if(i==3) {
				System.out.println("--------Regular Seat--------");
			}
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(" "+seat[i][j]+" ");
				if(i==0&&seat[i][j].equalsIgnoreCase("B")) {
					vipCount++;
				}
				else if(i>0&&i<3&&seat[i][j].equalsIgnoreCase("B")) {
					premiumCount++;
				}
				else if(i==3&&seat[i][j].equalsIgnoreCase("B")) {
					regularTotal++;
				}
			}
			System.out.println();
		}
		System.out.println("        SEAT BOOKED DETAILS        ");
		System.out.println("--------VIP SEAT--------");
		System.out.println("Booked Seat: "+vipCount+" Available Seat: "+(vipTotal-vipCount)+" Total VIP seat: "+vipTotal);
		System.out.println("--------Premium SEAT--------");
		System.out.println("Booked Seat: "+premiumCount+" Available Seat: "+(premiumTotal-premiumCount)+" Total VIP seat: "+premiumTotal);
		System.out.println("--------Regular SEAT--------");
		System.out.println("Booked Seat: "+regularCount+" Available Seat: "+(regularTotal-regularCount)+" Total VIP seat: "+regularTotal);



	}

}
