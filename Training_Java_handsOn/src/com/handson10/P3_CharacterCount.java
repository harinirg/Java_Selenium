/*
 * This program illustrates that Counts a, c, o, s from user input using HashMap.
 */
package com.handson10;
import java.util.HashMap;
import java.util.Scanner;
public class P3_CharacterCount {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        
	        String text = sc.nextLine();

	        text = text.toLowerCase();

	        HashMap<Character, Integer> map = new HashMap<>();

	        char[] chars = {'a', 'c', 'o', 's'};

	        for (char ch : chars) {
	            map.put(ch, 0);
	        }

	        for (char ch : text.toCharArray()) {
	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1);
	            }
	        }

	        System.out.println("Character counts:");
	        for (char ch : chars) {
	            System.out.println(ch + ": " + map.get(ch));
	        }
	        sc.close();
	    }
	}