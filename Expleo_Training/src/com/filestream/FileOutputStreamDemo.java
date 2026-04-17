package com.filestream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String args[]) {
		String data="Welcome to java portal!!!Have a Happy Learning";
		try {
			FileOutputStream output=new FileOutputStream("Demo2.txt");
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
