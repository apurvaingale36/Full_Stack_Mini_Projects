package com.mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="passport")

public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pass_id;
	public void setPass_id(int pass_id) {
		this.pass_id = pass_id;
	}
	private String number;
	
	
	public Passport() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPass_id() {
		return pass_id;
	}
	public Passport(int pass_id, String number) {
		super();
		this.pass_id = pass_id;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Passport [pass_id=" + pass_id + ", number=" + number + "]";
	}
	
}
