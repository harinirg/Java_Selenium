package com.Array;

public class Theatre1 {
	int theatreId;
	String theatreName;
	int totalTheatreScreens;
	String theatreLocation;     
	public void setTheatreDetails(int id, String name, int count,String address) {
		theatreId= id;
		theatreName= name;
		totalTheatreScreens= count;
		theatreLocation= address;
	}   
	public void getTheatreDetails(){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreId);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Total Theatre Halls : "+totalTheatreScreens);
		System.out.println("Theatre Location : "+theatreLocation);  
		System.out.println("--------------------------");
	}
	public static void main(String[] args) {
		Theatre1 T = new Theatre1();  
		T.setTheatreDetails(4523, "INOX", 10, "Kochi");
		T.getTheatreDetails();      
	}
}
