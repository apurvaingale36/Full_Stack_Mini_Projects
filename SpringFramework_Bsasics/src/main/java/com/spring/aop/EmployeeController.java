package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	
	@Autowired
	private Employee emp;
	@GetMapping("/emp/deletemp")
	public Employee add(@RequestParam("empid") int empid, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {
		
		return empservice.addemp(empid, firstname, lastname);
		
	}
	
	@GetMapping("/emp/deletemp")
	public int delete(@RequestParam("empid") int empid) {
		
		return empservice.delete(empid);
		
	}
	
	
}
