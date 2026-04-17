package com.handson7;
import java.util.Scanner;

public class CustomTrim {

    public static String myTrim(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scan.nextLine();

        String output = myTrim(input);

        System.out.println("Output:" + output);
        scan.close();
    }
}