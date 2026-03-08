package com.ClassesandObject;
class ParameterizedConstructor {

		// TODO Auto-generated method stub
		String theatreID;
		String theatreName;
		ParameterizedConstructor(String tid, String tname){
		theatreID = tid;
		theatreName = tname;
		}
		public void getTheatreDetails (){
		System.out.println("------Theatre Detail------");
		System.out.println("Theatre ID : "+theatreID);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("--------------------------");
		}
		}
public class Theatre1{

		public static void main(String[] args) {
		ParameterizedConstructor con= new ParameterizedConstructor("T4742","SPI Cinemas");
		con.getTheatreDetails();
		}

	}


