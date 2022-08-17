package com.org.tav.day2;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt(); 
		System.out.println("Enter emp no and yrs of exp");
		int[] array = new int[5];
		int []yrs=new int[5];
		for(int i=0; i<n; i++)  
		{    
		array[i]=sc.nextInt(); 
		yrs[i]=sc.nextInt();
		}  
		int ma=0;
		for(int i=0;i<n;i++) {
			if(yrs[i]>ma)
				ma=yrs[i];
		}
		for(int i=0;i<n;i++) {
			System.out.println("Emp No - "+array[i] + " Years of exp - "+yrs[i]);  
		}
		System.out.println("Max - "+ma);
	}

}


/*

user salary input, on the basis of salary
if(50k-1L) 20% hike
1L-5L - 25%hike
5L-10L- 28%hike

display the max hike salary, min hike salary, display all salary in sorted manner.

*/