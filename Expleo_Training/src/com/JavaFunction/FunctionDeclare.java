package com.JavaFunction;
import java.util.*;
public class FunctionDeclare {
	public static void getMovieDetails(String name,String description,float duration,String language,String date,String country,String genre) {
		System.out.println("Enter the Movie Name: "+name);
		System.out.println("Enter the Movie Description: "+description);
		System.out.println("Enter the Movie Duration: "+duration);
		System.out.println("Enter the Movie Language: "+language);
		System.out.println("Enter the Movie date: "+date);
		System.out.println("Enter the Movie country: "+country);
		System.out.println("Enter the Movie genre: "+genre);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Movie Name:");
		String name=scan.nextLine();
		System.out.println("Enter the Movie Description:");
		String description=scan.nextLine();
		System.out.println("Enter the Movie Duration:");
		float duration=scan.nextFloat();
		scan.nextLine();
		System.out.println("Enter the Movie Language:");
		String language=scan.nextLine();
		System.out.println("Enter the Movie Date:");
		String date=scan.next();
		System.out.println("Enter the Movie Country:");
		String country=scan.next();
		System.out.println("Enter the Movie Genre:");
		String genre=scan.next();
		getMovieDetails(name,description,duration,language,date,country,genre);
		scan.close();

	}

}
