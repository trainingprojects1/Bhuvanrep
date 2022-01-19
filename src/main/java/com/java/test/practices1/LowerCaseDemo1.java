package com.java.test.practices1;

public class LowerCaseDemo1 {

	 public String getLowercase(String name) {
		 String lowercase= name.toLowerCase();
		 return lowercase;

			}
	 public static void main(String[] args) {
		String name = " BHUVAN";
		LowerCaseDemo1 obj = new LowerCaseDemo1();
		String b = obj.getLowercase(name);
		System.out.println(b);
	}

}
