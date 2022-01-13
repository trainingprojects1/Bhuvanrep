package com.java.srp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/srp/overWrite.xml");
		  Person p1 = (Person)ctx.getBean("beanJeevan");
		  p1.showAllInfo();

		 
		  Person p2 = (Person)ctx.getBean("beenbhuvan");
		  p2.showAllInfo();
		  
		  Person p3 = (Person)ctx.getBean("beenhem");
		  p3.showAllInfo();

	}

}
