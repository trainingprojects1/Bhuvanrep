package com.java.srp;

public class Demo1 {
	public String getFullName(String FristName, String LastName) {
		String fullname = FristName.concat(LastName);
				
			return fullname;	
	}
		public static void main(String[] args) {
			Demo1 obj = new Demo1();
			String name = obj.getFullName("Aadityaa--   ", "Adhikari");
			System.out.println(name);
		}

}
