package com.sensei.exampractice;

public class Test {

	public static void main( String[] args ) {
		int z = 2;
		String a = z == 2 ? hello() : world();
		System.out.println( a );
	}
	
	public static String hello() {
		return "Hello";
	}
	
	public static String world() {
		return "world";
	}	
}