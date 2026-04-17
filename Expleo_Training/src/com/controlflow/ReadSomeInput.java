package com.controlflow;
import java.util.Scanner;
public class ReadSomeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=console.next();
		System.out.println("Hi,"+name+"."+"Welcome to Training Program.");
		console.close();

	}

}
