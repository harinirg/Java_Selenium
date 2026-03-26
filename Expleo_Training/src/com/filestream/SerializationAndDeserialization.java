package com.filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int empoId;
	public String empName;
	public Employee(int id,String name) {
		this.empoId=id;
		this.empName=name;
	}
}
public class SerializationAndDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee object=new Employee(1,"Ram");
		String filename="file.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object had been serialized");
		}
		catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		Employee object1=null;
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			object1=(Employee)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id="+object1.empoId+"Employee Name="+object1.empName);	
		}
		catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotException is caught");
		}
	}

}
