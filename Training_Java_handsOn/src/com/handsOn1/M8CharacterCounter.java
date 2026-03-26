/**
 * This program accepts a string and calculates
 * the number of letters and digits present in it.
 */
package com.handsOn1;
import java.util.*;
public class M8CharacterCounter {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter String:");
	        String str = scan.nextLine();
	        int letters = 0;
	        int digits = 0;
	        int others = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else {
	                others++;
	            }
	        }
	        System.out.println("Letters: " + letters + ", Digits: " + digits + ", Other Symbols: " + others);
	        scan.close();
	    }
}

