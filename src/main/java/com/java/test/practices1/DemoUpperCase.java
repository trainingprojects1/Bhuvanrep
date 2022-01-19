package com.java.test.practices1;

public class DemoUpperCase {
	
	public String showUpperCase( String name) {
		String uppercase = name.toUpperCase();
		return uppercase;
		
	}
public static void main(String[] args) {
	String name ="bhuvn  Adhikari";
	DemoUpperCase obj = new DemoUpperCase();
	String show = obj.showUpperCase(name);
	System.out.println(show);
	
}
}
