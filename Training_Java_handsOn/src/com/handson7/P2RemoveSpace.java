/*
 * This program illustrate that method myTrim() removes leading 
 * removes trailing spaces from a 
string without using built-in trim(). 
 */
package com.handson7;
import java.util.*;
public class P2RemoveSpace {
	public static String myTrim(String str) {
	int start=0;
	int end=str.length()-1;
	StringBuilder result=new StringBuilder();
	while((start<end)&&(str.charAt(start)==' ')){
		start++;
	}
	while((end>start)&&(str.charAt(end)==' ')) {
		end--;
	}
	for(int i=start;i<=end;i++) {
		result.append(str.charAt(i));
	}
	return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		System.out.println(myTrim(str));
		scan.close();

	}

}
