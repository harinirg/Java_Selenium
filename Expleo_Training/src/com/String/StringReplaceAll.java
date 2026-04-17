package com.String;

public class StringReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String originalString= "Quick brown fox";
			System.out.println("Original string: " + originalString);
			System.out.println("Replaced string: " + originalString.replaceAll("\\s+", ":"));
			System.out.println("Original string: " + originalString);
			System.out.println("Replaced string: " + originalString.replaceAll("[aeiouAEIOU]", "-"));

	}

}
