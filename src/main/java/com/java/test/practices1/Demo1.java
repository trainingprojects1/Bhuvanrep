package com.java.test.practices1;

public class Demo1 {
	public String getFullName(String FristName, String LastName) {
		String fullname = FristName.concat(LastName);
				
			return fullname;	
	}
		public static void main(String[] args) {
			Demo1 obj = new Demo1();
			String name = obj.getFullName("Aaditya  ", "Adhikari");
			System.out.println(name);
		}

}
