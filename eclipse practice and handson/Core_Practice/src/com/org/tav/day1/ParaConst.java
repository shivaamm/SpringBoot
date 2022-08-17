package com.org.tav.day1;

public class ParaConst {
	
	public ParaConst() {
		System.out.println("Zero Const...");
	}
	
	public ParaConst(int a) {
		System.out.println("One Const..."+a);
	}
	
	public ParaConst(int a, int b) {
		System.out.println("Two Const..."+a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParaConst p1=new ParaConst();
		 p1=new ParaConst(10);
		 p1=new ParaConst(20, 30);

	}

}
