package com.org.tav.day3;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Hello"; 
//		 String s2 = "Hello"; 
//		 
//		 String s3 = new String("Good bye"); 
//		 String s4 = new String("Hello"); 
//
//		System.out.println(s1.equals(s2)); // true because content and case is same. 
//		System.out.println(s1.equals(s3)); // false because content is different. 
//
//		System.out.println(s1.equals(args)); // false. 
//		System.out.println(s1.equals(null)); // false. 
//
//		if (s2.equals(s4)) 
//		{ 
//		    System.out.println("Both strings are equal"); 
//		 } 
//		 else { 
//		    System.out.println("Both strings are unequal"); 
//		 } 
//		}
		String s1 = "Java";

		String s2 = "Java";

		StringBuilder sb1 = new StringBuilder();

		sb1.append("Ja").append("va");

		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

		System.out.println(sb1.toString() == s1);

		System.out.println(sb1.toString().equals(s1));}
}