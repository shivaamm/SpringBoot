package com.org.tav.day2;

public class BinarySearch
{
	 public static int search(int[] arr, int n, int key)
	 {
	  int low = 0; // Lowest index of the array.
	  int high = n - 1; // Highest index.
	  int mid; // Middle index.
	  
	  while(high >= low)
	  {
		mid = (high + low)/2; //  Getting the middle index. 
		if(key == arr[mid])
		 return mid; // key found and exits from array. 
		if(key < arr[mid])
		  high = mid - 1;
		else
		  low = mid + 1;	
	  }
	 return -1; // Indicates key not found in the array.
 }
public static void main(String[] args) 
	{
		 int[] arr = {7, 10, 18, 21, 35, 45, 48, 50};
		 int i = BinarySearch.search(arr, 7, 45); // returns 5.
		 System.out.println("Element found " +i);
		 
		  int j = BinarySearch.search(arr, 7, 56); // returns -1.
		  System.out.println(j);
		  int k = BinarySearch.search(arr, 7, 15); // returns -1.
		  System.out.println(k);
		  int l = BinarySearch.search(arr, 7, 10); // returns 1.
		  System.out.println("Element found " +l);
	 }
}