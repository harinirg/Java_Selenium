/*
 * This program is to calculate the sum of digits 
 * if sum is 7 is given 1st prize
 * if sum is 5 is given 2nd prize
 * if sum is 3 is given 3rd prize
 */
package com.Assessment13;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the No of Participants:");
		int num=scan.nextInt();
		int arr[]=new int[num];
		System.out.println("Token Number for "+num+" participants:");
		for(int i=0;i<num;i++) {
			arr[i]=scan.nextInt();
		}

		int first=0,second=0,third=0;
		for(int i=0;i<num;i++) {
			int temp=arr[i];
			int sum=0;
			while(temp!=0) {
				sum+=temp%10;
				temp/=10;
			}
			while(sum>9) {
				 temp=sum;
				sum=0;
				while(temp!=0) {
				sum+=temp%10;
				temp/=10;
			}
			}
		if(sum==7) {
			first=arr[i];
		}
		else if(sum==5) {
			second=arr[i];
		}
		else if(sum==3) {
			third=arr[i];
		}
		}
		System.out.println("First Prize is to token: "+first);
		System.out.println("Second Prize is to token: "+second);
		System.out.println("Third prize is to token: "+third);
		scan.close();
		
	}

}
