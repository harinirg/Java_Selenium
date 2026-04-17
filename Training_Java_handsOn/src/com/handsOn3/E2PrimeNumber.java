/*
 * this program is used to find the prime number between the ranges
 */
package com.handsOn3;
import java.util.*;
public class E2PrimeNumber {
	static void primeNumber(int x,int y) {
		if (x > y) {
            System.out.println("Provide valid input");
            return;
        }
		for(int num=x;num<=y;num++) {
			boolean isPrime=true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ranges");
		int n=scan.nextInt();
		int m=scan.nextInt();
		primeNumber(n,m);
		scan.close();


	}

}
