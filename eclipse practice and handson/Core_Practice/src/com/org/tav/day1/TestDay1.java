package com.org.tav.day1;

import java.util.Scanner;

public class TestDay1 {
	
	/*
	 design the test class and take user input 
	name, Maths, science , english marks, computer science marks
	find total of the marks
	find % of total
	on basis of % decide the grades
	like if >85 then A
	if >90 the A+
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String Name = sc.next();
		System.out.println("Enter the Maths marks");
		float maths=sc.nextInt();
		System.out.println("Enter Science Marks");
		float sci = sc.nextInt();
		System.out.println("Enter English Marks");
		float eng = sc.nextInt();
		System.out.println("Enter CSE Marks");
		float cse = sc.nextInt();
		
		float score = maths+sci+eng+cse;
//		float score=344;
//		System.out.println("total " + total);
		
		float perc;
		perc = score/400*100;
	
//		System.out.println("Percentage of Total is " + perc);
		
		if(perc>80)
			System.out.println("Grade - 'A'. Percentage - " + perc);
		else if(perc>90)
			System.out.println("Grade - 'A+'. Percentage - " + perc);
		else
			System.out.println("Remaining Grades..."+ perc);
		

	}

}
