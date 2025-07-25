package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class EmployeeAspect {
	
	@Before(value="execution(* com.spring.aop.EmployeeService.*.*(..)) and args(empid, firstame, lastname)")
	public void before(JoinPoint joinpoint,int empid,String firstname, String lastname) {
		System.out.println("before method"+ joinpoint.getSignature());
		System.out.println("creating emp:"+firstname+ " "+lastname);
	}
}
