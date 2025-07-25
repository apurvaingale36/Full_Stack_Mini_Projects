package com.spring.aop;

public class Employee {
	private int empid;
	private String firstname;
	private String lastname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid2) {
		this.empid = empid2;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Employee() {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
}
