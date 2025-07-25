package com.apurva.spring.assign;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tyre")
public class Tyre implements Vehicle{

//	private String brand;
//	private String tyre;
////	public Tyre(String brand) {
////		super();
////		this.brand = brand;
////	}
//
//	public String getTyre() {
//		return tyre;
//	}
//
//	public void setTyre(String tyre) {
//		this.tyre = tyre;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	@Override
//	public String toString() {
//		return "Its working";
//	}

	@Override
	public void drive() {
		System.out.println("Qualifier is running");
		
	}
	
	
	
}
