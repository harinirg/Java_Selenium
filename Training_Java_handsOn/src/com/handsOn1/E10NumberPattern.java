/* 
 * Printing pattern
 */
package com.handsOn1;
import java.util.*;
public class E10NumberPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
