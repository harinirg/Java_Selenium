package com.filestream;
import java.io.FileInputStream;
public class FileInpuStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream("Demo2.txt");
			System.out.println("Data in the file");
			int i=input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
