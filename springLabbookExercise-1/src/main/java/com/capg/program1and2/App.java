package com.capg.program1and2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
    	Employee emp=(Employee)context.getBean("employee");
    	System.out.println(emp);

	}

}
