package com.capg.program3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		Sbu business=(Sbu)context.getBean("sbu");
		System.out.println(business);

	}

}
