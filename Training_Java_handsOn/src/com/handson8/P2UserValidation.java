package com.handson8;

import java.util.Scanner;

class InvalidUsernameException extends Exception{
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class P2UserValidation {
    
    static void validateUsername(String username) throws InvalidUsernameException{
        if(username.length()<6 || username.length()>30)
            throw new InvalidUsernameException("User name only consist of 6 to 30 characters");
        
        if(!(Character.isLetter(username.charAt(0)))) {
            throw new InvalidUsernameException("First character of username must be alphabetic character");
        }
        
        for(char c : username.toCharArray()) {
            if(!(Character.isLetterOrDigit(c) || c == '_')) {
                throw new InvalidUsernameException("Username can only contain letters, digits, underscores");
            }
        }
    }
    
    public static void validatePassword(String password) throws InvalidPasswordException{
        if(password.length()<8)
            throw new InvalidPasswordException("Password length is at least 8");
        
        boolean isLower = false;
        boolean isUpper = false;
        boolean isSpecial = false;
        boolean isDigit = false;
        
        for(char c : password.toCharArray()) {
            if(Character.isDigit(c))
                isDigit = true;
            else if(Character.isLowerCase(c))
                isLower = true;
            else if(Character.isUpperCase(c))
                isUpper = true;
            else
                isSpecial = true;
        }
        
        if(!(isLower && isUpper && isDigit && isSpecial))
            throw new InvalidPasswordException("Password must contain lowercase, uppercase, digit and special character");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String storedUsername = "HariniRG26";
        String storedPassword = "Harini@26";
        
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        
        try {
            validateUsername(username);
            validatePassword(password);
            
            if (username.equals(storedUsername) && password.equals(storedPassword)) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Invalid username or password");
            }
        }
        catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}