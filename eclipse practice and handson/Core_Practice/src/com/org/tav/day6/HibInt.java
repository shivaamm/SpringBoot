package com.org.tav.day6;

public class HibInt {
	
	interface Test1 {

		   default void show() {
		      System.out.println("show");
		   }
			
		   static void print() {
		      System.out.println("Print!!!");
		   }
		}
	
	interface Test2 {

		   default void show() {
		      System.out.println("show");
		   }
		}
	public class demo implements Test1,Test2{
		
		void print() {
			System.out.println("sfcifhsih");
		}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			Test1.super.show();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
	      d.print();
	}

}
