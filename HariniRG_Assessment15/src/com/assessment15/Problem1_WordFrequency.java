/*
 * This program illustrates that to find word frequency count sorted and also use exception .
 */
package com.assessment15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Problem1_WordFrequency {

		public static void main(String[] args) {
			try {
	            File file = new File("handson10.txt");
	            Scanner sc = new Scanner(file);

	            ArrayList<String> words = new ArrayList<>();

	            while (sc.hasNext()) {
	                words.add(sc.next().toLowerCase());
	            }
	            sc.close();

	            Collections.sort(words);

	            int uniqueCount = 0;
	            for (int i = 0; i < words.size(); i++) {
	                int count = 1;

	                while (i + 1 < words.size() && words.get(i).equals(words.get(i + 1))) {
	                    count++;
	                    i++;
	                }

	                System.out.println(words.get(i) + ": " + count);
	                uniqueCount++;
	            }

	            System.out.println("Unique words: " + uniqueCount);

	        } catch (FileNotFoundException e) {
	            System.out.println("Error: words.txt not found");
	        }
		}
}