package com.org.tav.spring.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("Bean.xml");
        
        HelloWorldService hello=con.getBean("hellobean",HelloWorldService.class);
        
        hello.hello();
    }
}
