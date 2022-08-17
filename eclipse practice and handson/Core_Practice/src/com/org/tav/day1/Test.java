package com.org.tav.day1;

import java.util.Scanner;

public class Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String Name = sc.next();
		System.out.println("Welcome " + Name);
	}

}

/*

design the test class and take user input 
name, Maths, science , english marks, computer science marks

find total of the marks
find % of total
on basis of % decide the grades
like if >85 then A
if >90 the A+


program - there's a printing press where the user placing the order theres a chart price given 0-99 copies so charge is 30paise.
if no of copies - 100-499 then charge is 28paisa per copy.
greater then 500 to 799 the charge is 27paise/- 
800-1000- then 26paise/-
over 1000 copies the charge is 25paise/-
find the total price for copies, and show price per copy and the range.

==> Types of Method in Java
instance methods- 



5)Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, 
then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating object of Student class.


*/