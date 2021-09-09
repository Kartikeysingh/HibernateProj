package com.prac.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prac.hibernate.Address;
import com.prac.hibernate.Car;
import com.prac.hibernate.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		user.setUserName("Kartikey Singh");
		Address adr = new Address();
		adr.setStreet("B-301, Ganpati Apartment");
		adr.setCity("Varanasi");
		adr.setState("U.P");
		adr.setPincode("221002");
		user.setHomeAddress(adr);
		user.setOfficeAddress(adr);

		Car car1 = new Car();
		car1.setColor("White");
		car1.setModel("TATA");

		Car car2 = new Car();
		car2.setColor("Black");
		car2.setModel("Kia Seltos");

		user.getCars().add(car1);
		user.getCars().add(car2);
		user.setJoinedDate(new Date());
		user.setDescription("I am a Senior Software Engineer");

		UserDetails user2 = new UserDetails();
		user2.setUserName("Dushyant Singh");
		Address adr2 = new Address();
		adr2.setStreet("B-301, Ganpati Apartment");
		adr2.setCity("Varanasi");
		adr2.setState("U.P");
		adr2.setPincode("221003");
		user2.setHomeAddress(adr2);
		user2.setOfficeAddress(adr2);

		Car car3 = new Car();
		car3.setColor("Silver");
		car3.setModel("Hyundai Verna");

		Car car4 = new Car();
		car4.setColor("Electric");
		car4.setModel("Tesla");

		user2.getCars().add(car3);
		user2.getCars().add(car4);

		user2.setJoinedDate(new Date());
		user2.setDescription("I am a MBA student.");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
	}

}
