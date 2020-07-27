package com.capg.testdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capg.model.Student;


public class StudentDaowithJPA {
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("student-unit");
	EntityManager em=emf.createEntityManager();
	Student t1=new Student(109,"rohan","22-12-2020");
	EntityTransaction tx=em.getTransaction();
	//insertion
    tx.begin();
	em.persist(t1);
	tx.commit();
	System.out.println("Added a new student");
	//update and display
	tx.begin();
	Student s1=em.find(Student.class, 102);
	t1.setStudentName("pavan Reddy");
	tx.commit();
	System.out.println(t1);
	//deletion
	tx.begin();
	em.remove(t1);
	tx.commit();
	//search by name
	String name="kiran";
	TypedQuery<Student> q=em.createQuery("from Student s where s.studentName=:name",Student.class);
	q.setParameter("name", name);

}
}