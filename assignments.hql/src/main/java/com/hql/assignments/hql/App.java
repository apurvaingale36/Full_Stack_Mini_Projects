package com.hql.assignments.hql;

import java.util.List;
import java.util.Random;

import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Selection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s=new Student();
    	//Random r=new Random();
    
    	
    	Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
    	
		Transaction tx=session.beginTransaction();
		//insert
//		s.setName("kajal");
//		s.setAge(r.nextInt(50));
		
		
		//fetch
//		List<Student> q=session.createQuery("from Student", Student.class).list();
//		for(Student i:q) {
//			System.out.println(i);
//		}
		
		//delete
		int q = session.createQuery("delete Student where id= :Id")
				.setParameter("Id", 3)
				.executeUpdate();
		
		
		//fetch specific range
//		List<Student> q=session.createQuery("from Student where age between 10 and 20", Student.class).list();
//		for(Student i:q) {
//			System.out.println(i);
//		}
		
		//sort in asc
//		List<Student> q=session.createQuery("from Student order by name asc", Student.class).list();
//		for(Student i:q) {
//			
//			System.out.println(i);
//		}

		//total(agg)
//		Long sumage=(Long) (session.createQuery("select sum(age) from Student").getSingleResult());
//		System.out.println(sumage);	
		
		
		//second level cache
//		Session session1=sessionFactory.openSession();
//		session1.beginTransaction();
//		s= (Student) session1.get(Student.class,1);
//		System.out.println(s);
//		
//		session1.getTransaction().commit();
//		session1.close();
//		
//		Session session2=sessionFactory.openSession();
//		session2.beginTransaction();
//		s= (Student) session2.get(Student.class,2);
//		System.out.println(s);
//		
//		session2.getTransaction().commit();
//		session2.close();
		

		
		session.save(s);
		
		tx.commit();
		session.close();
		
		
    }
}
