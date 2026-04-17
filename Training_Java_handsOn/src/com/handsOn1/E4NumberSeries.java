/*
 * This program using do-while loop to evaluate the series 1+2+3+…..+i.
 */
package com.handsOn1;
import java.util.*;
public class E4NumberSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int i=scan.nextInt();
		int sum=0;
		int n=1;
		do {
			sum=sum+n;
			n++;
		}while(n<=i);
		System.out.println("Sum: "+sum);
		scan.close();
	}
}
