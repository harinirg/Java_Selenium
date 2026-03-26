package com.encapsulation;

public class Theatre {
	private int _theatreId;
	private String _theatreName;
	private int _totalTheatreScreens;
	private String _theatreLocation;         
	public void setTheatreId(int id) {_theatreId= id;}
	public void setTheatreName(String name) {_theatreName= name;}
	public void setTheatreTotalScreen(int count) {_totalTheatreScreens= count;}
	public void setTheatreLocation(String name) {_theatreLocation= name;}
	public int getTheatreId(){return _theatreId;}
	public String getTheatreName(){return _theatreName;}
	public int getTheatreTotalScreen(){return _totalTheatreScreens;}
	public String getTheatreLocation(){return _theatreLocation;}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre();
		theatre.setTheatreId(1002);
		theatre.setTheatreName("INOX");
		theatre.setTheatreTotalScreen(10);
		theatre.setTheatreLocation("Chennai");
		System.out.println("--------Theatre Detail----------");
		System.out.println("Theatre ID : "+theatre.getTheatreId());
		System.out.println("Theatre Name : "+theatre.getTheatreName());
		System.out.println("Theatre Total Screen : "+theatre.getTheatreTotalScreen());
		System.out.println("Theatre Location : "+theatre.getTheatreLocation());

	}

}
