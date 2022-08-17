package com.org.tav.day2;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[ ] str = {"Shivam", "Priyank","Arsh"};
			System.out.print("Enter 2D array size : ");
	       Scanner sc=new Scanner(System.in);
	       int rows=sc.nextInt();
	       int columns=sc.nextInt();
	       
	       System.out.println("Enter marks : ");    
	        
	       int marks[][]=new int[rows][columns];
	        
	          
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                marks[i][j]=sc.nextInt();
	            }
	         }
		   
			for(int i = 0; i < marks.length; i++)
			{
				int total = 0;	
				 for(int j = 0; j < marks.length; j++)
				 {
				    total = total + marks[i][j]; 
				    
				 }
				 double perc = (double)total/3;
				 System.out.println("Total marks "  +total);
				   
				   System.out.println("Percentage: " +perc);

		}
	}
}


/*

binary search program in java using arrays

*/