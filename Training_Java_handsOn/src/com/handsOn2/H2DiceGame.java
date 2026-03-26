/**
 * Arun and Naveen play a dice game for 10 turns and Each player's dice values are stored in separate arrays.
 * The winner is decided by comparing the total score.
 */
package com.handsOn2;
import java.util.*;
public class H2DiceGame {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of turns: ");
		int n=scan.nextInt();
		int arun[]=new int[n];
		int naveen[]=new int[n];
		int total1=0,total2=0;
		System.out.println("Enter the Arun dice value: ");
		for(int i=0;i<n;i++) {
			arun[i]=scan.nextInt();
			total1+=arun[i];
		}
		System.out.println("Enter the Naveen dice value: ");
		for(int i=0;i<n;i++) {
			naveen[i]=scan.nextInt();
			total2+=naveen[i];
		}
		if(total1>total2) {
			System.out.println("Arun wins");
		}
		else if(total2>total1) {
			System.out.println("Naveen wins");
		}
		else {
			System.out.println("Match draw");
		}
		scan.close();
	}
}
