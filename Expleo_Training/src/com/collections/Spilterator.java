package com.collections;
import java.util.*;
public class Spilterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double>Arr=new ArrayList<Double>();
		System.out.println("Initial size of Array List is "+Arr.size());
		Arr.add(1.0);
		Arr.add(2.0);
		Arr.add(3.0);
		Arr.add(4.0);
		Arr.add(5.0);
		Arr.add(6.0);
		System.out.println("Contents of ArrayList using tryAdvance");
		Spliterator<Double>sitr=Arr.spliterator();
		while(sitr.tryAdvance((n)->System.out.print(n+" ")));
		System.out.println();
		System.out.println("Contents of ArrayList using forEachRemaining");
		sitr=Arr.spliterator();
		sitr.forEachRemaining((n)->System.out.print(n+" "));
		System.out.println();
		System.out.println("Size of Array List after insertion is "+Arr.size());
		

	}

}
