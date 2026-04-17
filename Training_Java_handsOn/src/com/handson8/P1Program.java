package com.handson8;

import java.util.Scanner;

class Calculator {

    long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        long result = 1;

        for (int i = 1; i <= p; i++) {
            result = result * n;
        }

        return result;
    }
}

public class P1Program {

    public static void start() {

        Scanner scan = new Scanner(System.in);
        Calculator obj = new Calculator();

        while (scan.hasNextInt()) {

            int n = scan.nextInt();
            int p = scan.nextInt();

            try {
                System.out.println(obj.power(n, p));
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        start(); 
    }
}