package com.spring.aop.ass;
/*
 * Spring AOP AssignmentsAssignment 1: Introduction to AOP in Spring
Create a simple Spring Boot application that includes the necessary dependencies for Spring AOP.
a. Configure a basic Spring component, e.g., Calculator, with methods for addition, subtraction, multiplication, and division.
b. Implement an aspect, e.g., LoggingAspect, to log method execution before and after each operation in the Calculator class.
c. Demonstrate how the aspect intercepts method calls and logs information.
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) throws IllegalAccessException {
	ApplicationContext context=SpringApplication.run(SpringAopApplication.class, args);
	
	Calculate cal=context.getBean(Calculate.class);
	System.out.println(cal.addition(10, 30));
	System.out.println(cal.mutliplication(10, 30));
	System.out.println(cal.subtraction(70, 30));
	System.out.println(cal.division(10, 30));

		
	}

}
