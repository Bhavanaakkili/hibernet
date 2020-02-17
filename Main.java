package com.cts.embeded;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello");
		Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address("city1", "state1");
		Person p1 = new Person(10, "Amar", address);
		session.save(p1);
		
		transaction.commit();
		session.close();
		System.out.println("Done ...");
	}
}