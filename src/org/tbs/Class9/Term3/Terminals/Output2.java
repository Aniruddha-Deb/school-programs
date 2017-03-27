/**
Output:
values are missing
integer values : 14
double values: 6.7

Note: due to decimal overflow, the double output is 6.699999999999999. However, 
this will not be taken into consideration.
 */
package org.tbs.Class9.Term3.Terminals;

public class Output2 {

	public static int add( int a, int b ) {
		return a+b;
	}
	
	public static double add( double c, double d ) {
		return c+d;
	}
	
	public static void add() {
		System.out.println( "values are missing" );
	}
	
	public static void main( String[] args ) {
		int p=2, q=12;
		double m=2.4, n=4.3;
		int a1 = add( p, q );
		double a2 = add( m, n );
		add();
		System.out.println( "integer values : " + a1 );
		System.out.println( "double values: " + a2 );
	}
}
