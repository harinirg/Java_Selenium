/*
 * This program illustrates to remove the duplicates in the String
 * print or display the String without duplication.
 */
package com.handson7;
import java.util.*;
public class P1RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Input");
		String input=scan.nextLine();
		String str=input.toLowerCase();
		StringBuilder result=new StringBuilder();
		boolean[] seen=new boolean[256];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!seen[ch]) {
				seen[ch]=true;
				result.append(ch);
			}
		}
		System.out.println(result);
		scan.close();
	}

}
