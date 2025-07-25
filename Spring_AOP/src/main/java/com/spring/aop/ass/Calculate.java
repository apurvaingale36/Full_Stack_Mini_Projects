package com.spring.aop.ass;

import org.springframework.stereotype.Component;

@Component
public class Calculate {
	
	
	public int addition(int a, int b) {
		System.out.println("addition :");
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		System.out.println("subtraction :");
		return a-b;
	}
	
	public int mutliplication(int a, int b) {
		System.out.println("multiplication :");
		return a*b;
	}
	
	public int division(int a, int b) throws IllegalAccessException {
		if(b==0) {
			throw new SecurityException("Cannot divide by zero");
		}
		System.out.println("division :");
		return a/b;
		
	}
	
}
