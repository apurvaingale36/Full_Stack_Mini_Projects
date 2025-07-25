package com.spring.aop.ass;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Performance {
	@Around("execution(* com.spring.aop.ass.Calculate.*(..))")
	public Object performance(ProceedingJoinPoint joinpoint) throws Throwable {
		long start_time=System.currentTimeMillis();
		
		Object result= joinpoint.proceed();
		
		long end_time=System.currentTimeMillis();
		
		long exctime=end_time-start_time;
		
		
		System.out.println("performance metrics: " +joinpoint.getSignature().getName());
		System.out.println("execution time: "+exctime+ "milliseconds");
		return result;
		
	}
}
