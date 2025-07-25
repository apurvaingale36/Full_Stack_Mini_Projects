package com.hibernate_que;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Alien a=new Alien();
		a.setAid(101);
		a.setName("apurva");
		a.setAcolor("blue");
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.save(a);
	}
}
