package com.apurva.spring.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
   //Assignment 1 & 3
//    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Car.class);
//    	 
//    	context.getBean("drive");
    	
   //assignment 4 & 6 (Setter and constructor injection)
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Tyre t=(Tyre) context.getBean("tyre");
//    	System.out.println(t);
    
   //assignment 5 (Autowire & qualifier)

//    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//    	Car c=(Car)context.getBean("car");
//    	c.drive();
//    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Car c=(Car)context.getBean("car");
    	c.drive();
    }
}
