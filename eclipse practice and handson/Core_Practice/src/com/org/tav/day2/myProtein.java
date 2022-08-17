package com.org.tav.day2;

 class Proteins {  // parent class
	Proteins()   // parent const
	{ 
	  System.out.println("Protein is one of the basic building blocks of the Human body. "); 
	  System.out.println("Hair, Skin, Eyes, Muscles, and organs are all made up of Protein"); 
	 } 
	}
	 class Source extends Proteins  // child class from parent
	{ 
		Source() 
		{ 
		  this(1); 
		  System.out.println("Source of Proteins are milk, eggs, meat, pulses, soybeans"); 
		} 
		Source(int s) 
		{ 
		  super(); 
		  System.out.println("Proteins are made up of amino acids"); 
	 }
}

public class myProtein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source sc = new Source();
	}

}

/*
company havinh 3 dept
all dept would like to use= my salary count in formula
dept= HR,services, testing
create a justice program


q2. my company have java skilled emp ? after getting the details of the java emp. compnay will give increment to all tjose emp.
		emp details= id, name, skill, yr of exp,
		then after increment then show the details again.
*/
/*


create 3 classes - myprotien - main
	two child class - protein class

	source - child class
*/