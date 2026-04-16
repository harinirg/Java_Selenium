/*
 * Display “ding” for every 5th number and “dong” for every 10th number
 */
package com.Assessment13;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the start and ending Number ");
		int start=scan.nextInt();
		int end=scan.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%10==0) {
				System.out.print("dong ");
			}
			else if(i%5==0) {
				System.out.print("ding ");
			}
			else {
				System.out.print(i+" ");
			}
		}
		scan.close();

	}

}
