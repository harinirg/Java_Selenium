package com.controlflow;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//import.java.text.SimpleDateFormat;
public class ReadInput {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Movie ID :");
		int Id=scan.nextInt();
		System.out.println("Enter Movie Name:");
		String name=scan.next();
		scan.nextLine();
		System.out.println("Enter Movie Description :");
		String Description=scan.nextLine();
		System.out.println("Enter Language :");
		String language=scan.next();
		System.out.println("Enter Movie Genre:");
		String Genre=scan.next();
		System.out.println("Enter Movie releasse date(dd/mm/yyyy):");
		String date=scan.next();
		SimpleDateFormat moviereleasedate=new SimpleDateFormat("dd/mm/yyyy");
		Date moviedate=moviereleasedate.parse(date);
		System.out.println("Enter Movie Seat Cost:");
		float movieseatcost=scan.nextFloat();
		System.out.println("ENTERED MOVIE DETAILS ");
		System.out.println("Enter Movie ID :"+Id);
		System.out.println("Enter Movie Name:"+name);
		System.out.println("Enter Movie Description :"+Description);
		System.out.println("Enter Language :"+language);
		System.out.println("Enter Movie Genre:"+Genre);
		System.out.println("Enter Movie releasse date(dd/mm/yyyy):"+moviedate);
		System.out.println("Enter Movie Seat Cost:"+movieseatcost);
		scan.close();
		
		
		
		
		
	}

}
