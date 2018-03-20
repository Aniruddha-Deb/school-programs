package com.sensei.exampractice;

public class Test {

	/* ICSE 2012 */
	
	public static void polygon( int n, char ch ) {
		for( int i=0; i<n; i++ ) {
			for( int j=0; j<n; j++ ) {
				System.out.print( ch );
			}
			System.out.println(  );
		}
	}
	
	public static void polygon( int x, int y ) {
		for( int i=0; i<y; i++ ) {
			for( int j=0; j<x; j++ ) {
				System.out.print( '@' );
			}
			System.out.println(  );
		}
	}
	
	public static void main( String[] args ){
		polygon( 5, 'a' );
		polygon( 15, 25 );
	}
	
}