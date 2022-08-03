package com.org.tav.spring.singleton;

public class Dbconn {
	static Dbconn conn=new Dbconn();

	private  Dbconn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Dbconn getInstance()
	{
		return conn;
	}

}
