package com.apurva.example_hibernate;
public class Alien {
	
	private int aid;
	private String name;
	private String acolor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	public Alien() {
		super();
		this.aid = aid;
		this.name = name;
		this.acolor = acolor;
	}
	
}
