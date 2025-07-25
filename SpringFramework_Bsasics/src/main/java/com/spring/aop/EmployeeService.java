package com.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	public Employee addemp(int empid,String firstname,String lastname) {
		Employee emp=new Employee();
		emp.setEmpid(empid);
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		return emp;
	}
	
	public int delete(int empid) {
		System.out.println("emp removed");
		return empid;
	}
}
