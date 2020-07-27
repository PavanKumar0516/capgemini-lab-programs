package com.capg.jpa.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpa.demo.model.Employee;

public class EmployeeDbOperations {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee-unit");
		EntityManager em=emf.createEntityManager();
		Employee t1=new Employee(108,"kiran",50000);
		EntityTransaction tx=em.getTransaction();
	    tx.begin();
		em.persist(t1);
		tx.commit();
		System.out.println("Added a new Employee");
		tx.begin();
		Employee e1=em.find(Employee.class, 107);
		t1.setName("pavan Reddy");
		tx.commit();
		System.out.println(t1);
	}

}
