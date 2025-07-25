package com.spring.aop.ass;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Login {
	
	@Before("execution(* com.spring.aop.ass.Calculate.*(..))")
	public void logBefore() {
		System.out.println("Before method");
	}
	
	@After("execution(* com.spring.aop.ass.Calculate.*(..))")
	public void logAfter() {
		System.out.println("After method");
	}
	
}
