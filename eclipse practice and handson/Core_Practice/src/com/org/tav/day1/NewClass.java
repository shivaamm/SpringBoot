package com.org.tav.day1;

public class NewClass {
	
	// default constructor = since we didn't create any constructor but still this will work 
		// cuz java compiler creates a default constructor automatically. jvm creates the default const
	
	String name; int age; String address;
	
	void show() {
		System.out.println("Name: " + name +" Age: "+age + " Address: "+ address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewClass obj = new NewClass(); // default constructor
		
		obj.show();
 
	}

}
