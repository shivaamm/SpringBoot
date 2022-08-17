package com.org.tav.day2;

public class MyThread extends Thread {
	//override
	public void run() {
		System.out.println("New Thread Running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Thread running...");
		MyThread t1=new MyThread();
//		Thread t=new Thread(t1);
		t1.start();
	}

}
