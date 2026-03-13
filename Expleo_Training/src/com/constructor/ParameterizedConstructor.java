package com.constructor;

public class ParameterizedConstructor {

	int theatreId;
	String theatreName;
	int totalTheatreScreens;
	String theatreLocation;

	ParameterizedConstructor(int tid, String tname, int halls, String addr) {
		theatreId = tid;
		theatreName = tname;
		totalTheatreScreens = halls;
		theatreLocation = addr;
	}

	public void getTheatreDetails() {
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : " + theatreId);
		System.out.println("Theatre Name : " + theatreName);
		System.out.println("Total Theatre Screens : " + totalTheatreScreens);
		System.out.println("Theatre Location : " + theatreLocation);
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {

		ParameterizedConstructor T =
				new ParameterizedConstructor(101, "PVR Cinemas", 5, "Chennai");

		T.getTheatreDetails();
	}
}