package org.stackroute.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataInsert {
	
	public static void main(String[] args) {
		
		//insert Data 
		//Create Session 
		
		SessionFactory factory = new Configuration().addAnnotatedClass(Person.class).configure().buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			System.out.println("Saving data into Database");
			session.beginTransaction();
			Person p = new Person(101, "Red Ranger", "Japan");
			session.save(p);
			
			session.getTransaction().commit();
			System.out.println("Data Stored Succefully");
			
		} finally {
			factory.close();
		}
		
	}

}
