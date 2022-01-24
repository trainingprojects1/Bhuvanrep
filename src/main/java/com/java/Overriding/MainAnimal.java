package com.java.Overriding;

import course.Calc;

public class MainAnimal {
	public static void main(String[] args) {
		 Animal ani = new Animal();
		 String s = ani.breath();
		  System.out.println(s);
		 ani.Walk();
		 CatChild c = new CatChild();
		 //String a = c.meow();
		// System.out.println(a);
		System.out.println(c.meow());
		System.out.println(c.math(5, 9));
		c.dog();
		System.out.println(c.milk());
		
		 
	}

}
