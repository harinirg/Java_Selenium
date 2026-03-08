/*
 * This program is to check whether the given Character is 
 * an Alphabet/ Digit /Special Symbol using if-else-if statement.
 */
package com.handsOn1;
import java.util.*;
public class E8CharacterCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch=scan.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("Alphabet");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special symbol");
		}
		scan.close();
	}

}
