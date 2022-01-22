package com.java.Array;
public class ReserveExe {
	public static String showreverse( String name) {
		StringBuffer m = new StringBuffer(name);
		return m.reverse().toString();
	}
	public static String giveAnyNumber() {
		Integer a = 1;
	
		return a.toString();	
	}
	public static void main(String[] args) {
		String result = showreverse("Bhuvan");
		System.out.println(result);
		System.out.println(giveAnyNumber());
		
	}
}
