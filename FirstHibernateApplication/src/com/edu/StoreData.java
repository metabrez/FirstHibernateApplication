package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		//creating configuration object
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populate the data of configuration file
		
		//creating session factory object
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session Object
		Session session=factory.openSession();
		
		//creating Transaction Object
		
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		
		e1.setId(123);
		e1.setFirstName("Tabrez");
		e1.setLastName("Alam");
		
		//Persisting the object
		
		session.persist(e1);
		
		//commiting the Transaction
		
		t.commit();
		session.close();
		
		System.out.println("Successfully Saved");
		
	}
}
