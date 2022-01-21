package com.java.Array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int a[]= {1,2,5,4};
		int b[]= {2,4,6,8};
		int c[]= {3,6,9,12};
		
			
		
		int d[][]= {
				{1,2,5,4},
				{2,4,6,8},
				{3,6,9,12}
		};
				
		for ( int i = 0; i <3; i ++) {
		for ( int j =0; j <4; j ++)	{
			System.out.print(" "+d[i][j]);
		}
		System.out.println();
		}
	}

}
