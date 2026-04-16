package com.handson7;

import java.util.Scanner;

public class EmailValidator {

    public static boolean validateEmail(String email) {

        int atIndex = email.indexOf('@');

        if (atIndex <= 0 || atIndex == email.length() - 1) {
            return false;
        }

        String local = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        if (!Character.isLetter(local.charAt(0))) {
            return false;
        }

        for (int i = 0; i < local.length(); i++) {
            char ch = local.charAt(i);

            if (!(Character.isLetterOrDigit(ch) || ch == '.' || ch == '_' || ch == '-')) {
                return false;
            }

            if (i > 0) {
                char prev = local.charAt(i - 1);
                if ((ch == '.' || ch == '_' || ch == '-') &&
                    (prev == '.' || prev == '_' || prev == '-')) {
                    return false;
                }
            }
        }

        char lastLocal = local.charAt(local.length() - 1);
        if (lastLocal == '.' || lastLocal == '_' || lastLocal == '-') {
            return false;
        }

        if (!domain.contains(".")) {
            return false;
        }

        String parts[] = domain.split("\\.");

        for (String part : parts) {

            if (part.length() == 0) {
                return false;
            }

            if (!Character.isLetterOrDigit(part.charAt(0)) ||
                !Character.isLetterOrDigit(part.charAt(part.length() - 1))) {
                return false;
            }

            for (int i = 0; i < part.length(); i++) {
                char ch = part.charAt(i);

                if (!(Character.isLetterOrDigit(ch) || ch == '-')) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter corporate email: ");
        String email = scan.nextLine();

        if (validateEmail(email)) {
            System.out.println("Valid corporate email");
        } else {
            System.out.println("Invalid corporate email");
        }
    }
}