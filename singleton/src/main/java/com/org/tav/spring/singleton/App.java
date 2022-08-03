package com.org.tav.spring.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Dbconn c = 	Dbconn.getInstance();
		Dbconn c1= Dbconn.getInstance();
    }
}
