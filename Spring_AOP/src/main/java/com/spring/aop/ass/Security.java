package com.spring.aop.ass;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Security {
	
	@Before("execution(public int division())")
	public void divisionSecurity() {
		System.out.println("Security check if divide by zero");
	}
	
	
	@Before("execution(* com.spring.aop.ass.Calculate.*(..)) && args(a,b)")
	public void arithmeticSecurity(int a, int b) {
		System.out.println("Security check for arithmetic operations");
	}
	
}
