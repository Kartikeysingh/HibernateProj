package com.prac.entitymapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setEmployeeName("Kartikey Singh");

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Car");
		vehicle1.setEmployeeDetail(emp1);
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Jeep");
		vehicle2.setEmployeeDetail(emp1);
		// emp1.setVehicle(vehicle1);
		emp1.getListOfVehicles().add(vehicle1);
		emp1.getListOfVehicles().add(vehicle2);

		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.setEmployeeName("Rachit Singh");

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setVehicleName("Bike");
		vehicle3.setEmployeeDetail(emp2);
		Vehicle vehicle4 = new Vehicle();
		vehicle4.setVehicleName("Sedan");
		vehicle4.setEmployeeDetail(emp2);
		// emp2.setVehicle(vehicle2);
		emp2.getListOfVehicles().add(vehicle3);
		emp2.getListOfVehicles().add(vehicle4);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp1);
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(emp2);
		session.save(vehicle3);
		session.save(vehicle4);
		session.getTransaction().commit();
	}

}
