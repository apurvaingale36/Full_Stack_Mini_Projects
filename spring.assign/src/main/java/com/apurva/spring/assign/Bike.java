package com.apurva.spring.assign;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bike")
public class Bike implements Vehicle{

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike is on highway");
	}

}
