package com.hibernate.examples.hibernate.questions;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.transaction.Transaction;


/**
 * Hello world! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Item item = new Item();

    	Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		//insert
//		item.setName("hp laptop");
//		item.setPrice(70890.75);
		org.hibernate.Transaction tx=session.beginTransaction();
//		session.save(item);
//		
//		//fetch
//		item=(Item) session.get(Item.class,2);
//		System.out.println(item);
//				
//		//update
//		Item item1=session.get(Item.class,2);
//		if(item1!=null) {
//			item1.setName("VR BOx");
//			item1.setPrice(900);
//			session.update(item1);
//		}
//		else {
//			System.out.println("id not found");
//		}
		
		//delete
		Item item2=session.get(Item.class,4);
		if(item2!=null) {
			session.delete(item2);
		}
		else {
			System.out.println("id not found");
		}
		
		tx.commit();
		session.close();
	}    }
