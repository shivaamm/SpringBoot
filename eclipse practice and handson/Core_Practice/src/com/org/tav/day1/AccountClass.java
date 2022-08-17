package com.org.tav.day1;

class AccountDetails{

	private String Username;
	private int AccNo;
	private String AccBal;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getAccBal() {
		return AccBal;
	}
	public void setAccBal(String accBal) {
		AccBal = accBal;
	}
	
}
public class AccountClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountClass ob=new AccountClass();
		AccountDetails a=new AccountDetails();
		a.setUsername("Shivam");
		a.setAccBal("4000");
		a.setAccNo(828);
		
		System.out.println(a.getAccBal());

	}

}


/*
 
 class name - Mensuration
 declare 3 vars- demonstrate - get and set
output the area and perimeter rectangle the area and circumference of the circle.


*/


