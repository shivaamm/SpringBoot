package com.org.tav.day1;

import java.util.Scanner;

public class PrintingPress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no of copies: ");
		int copies = sc.nextInt();
		int res;
		
		if(copies>0 && copies<=99) {
			res=copies*30;
			System.out.println("Total Price for Copies " + res);
			System.out.println("Price Per Copy is 30 and Range = 0-99");
		}
		else if(copies>100 && copies<=499) {
			res=copies*28;
			System.out.println("Total Price for Copies " + res);
			System.out.println("Price Per Copy is 28 and Range = 100-499");
		}
		else if(copies>500 && copies<=799) {
			res=copies*27;
			System.out.println("Total Price for Copies " + res);
			System.out.println("Price Per Copy is 27 and Range = 500-799");
		}
		else if(copies>800 && copies<=1000) {
			res=copies*26;
			System.out.println("Total Price for Copies " + res);
			System.out.println("Price Per Copy is 26 and Range = 800-1000");
		}
		else {
			res=copies*25;
			System.out.println("Total Price for Copies " + res);
			System.out.println("Price Per Copy is 25 and Range over 1000");
		}
		
	}

}
