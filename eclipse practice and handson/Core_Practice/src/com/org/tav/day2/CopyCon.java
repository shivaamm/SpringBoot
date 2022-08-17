package com.org.tav.day2;

public class CopyCon {
	int x=10;int y=20;
	
	public CopyCon() {
		super();
	}
	
	CopyCon(CopyCon n){
		x=n.x;
		y=n.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyCon n=	new CopyCon();
		System.out.println("Value x "+n.x);
		System.out.println("Vaule y "+n.y);
		
		n.x=50; n.y=40;
		System.out.println("Updated Value");
		System.out.println("Value x "+n.x); // 50
		System.out.println("Vaule y "+n.y); // 40
		
		
		CopyCon n2=	new CopyCon(); // here the values will be actual which is 10,20 cuz we're not creating an copy
		System.out.println("Not getiing updated of a and b in new obj");
		System.out.println("Value x "+n2.x); // 10
		System.out.println("Vaule y "+n2.y); // 20
		
		CopyCon n3=	new CopyCon(n); // it's an copy const of line 17 since we updated the values there.
		System.out.println("Getting updated of x and y in new obj");
		System.out.println("Value x "+n3.x); // 50
		System.out.println("Vaule y "+n3.y); // 40
	}

}
