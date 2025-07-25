package com.apurva.spring.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class Car{
	
	@Autowired
	@Qualifier("bike")
	//private Tyre tyre;
	private Vehicle vehicle;

//	public Tyre getTyre() {
//		return tyre;
//	}

//	public void setTyre(Tyre tyre) {
//		this.tyre = tyre;
//	}
	
	//@Bean
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("car is running "+ vehicle);
	}
	
	
	
	
	
//		@Bean
//		public void drive(){
//			System.out.println("Car is on road");
//		}
}
