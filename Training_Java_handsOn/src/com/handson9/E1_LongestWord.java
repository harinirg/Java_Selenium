package com.handson9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E1_LongestWord {

    public static void main(String[] args) {

        try {

            File f = new File("handson9.txt");
            Scanner sc = new Scanner(f);

            String longest = "";

            while(sc.hasNext()) {

                String word = sc.next();

                if(word.length() > longest.length()) {
                    longest = word;
                }

            }

            System.out.println("Longest word: " + longest);

        }

        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

}