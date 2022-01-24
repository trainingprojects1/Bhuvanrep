package com.java.Overriding;

public class CatChild extends Animal{
	@Override

	public void Walk() {
		System.out.println("Childclass cat can walk");
	}
	@Override
	public String breath() {
		
		return(" chaildclass cat can breath");
	}
	
	public String meow() {
		
		return ("Child class cat can meow");
	}
	public static int math(int a , int b) {
		int t= a+b;
		return t;
	}
	public void dog() {
		System.out.println("dog can bark");
	}
	public static String milk() {
		return "cat can drink milk";
	}
	
	
}
