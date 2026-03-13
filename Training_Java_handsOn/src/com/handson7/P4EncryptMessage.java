/*
 * This program illustrate that to encrypt the message Like 
 * 1. Alphabet characters (A–Z, a–z), Shift each alphabet by +3 positions
 * 2.Digits (0–9), Keep digits unchanged.
 * 3.Spaces ,Replace each space with an underscore (_).
 * All other characters,Copy them as-is
 */
package com.handson7;
import java.util.*;
public class P4EncryptMessage {
	public static String encrypt(String str) {

		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				char newChar=(char)((ch-'A'+3)%26+'A');
				result.append(newChar);
			}
			else if(ch>='a'&&ch<='z') {
				char newChar=(char)((ch-'a'+3)%26+'a');
				result.append(newChar);
			}
			else if(ch>='0' && ch<='9') {
				result.append(ch);
			}
			else if(ch==' ') {
				result.append('_');
			}
			else {
				result.append(ch);
			}
		}

		return result.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= scan.nextLine();
		System.out.println(encrypt(str));
	}

}
