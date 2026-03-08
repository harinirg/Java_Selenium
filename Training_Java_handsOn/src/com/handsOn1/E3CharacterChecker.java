/*
 * This program use switch case structure to print the appropriate message to 
 * recognize the entered character is vowel, consonant or symbol.
 */
package com.handsOn1;
import java.util.*;
public class E3CharacterChecker {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=scan.next().charAt(0);
		switch(ch) {
		case 'a':case'e':case'i':case'o':case'u':
		case 'A':case'E':case'I':case'O':case'U':
			System.out.println(ch+" is vowel");
			break;
		default:
			if((ch>='a'&&ch<='z')|(ch>='a'&&ch<='z')) {
				System.out.println(ch+" is consonant");
			}
			else {
				System.out.println(ch+" is a symbol");
			}
		}
		scan.close();
	}
}
