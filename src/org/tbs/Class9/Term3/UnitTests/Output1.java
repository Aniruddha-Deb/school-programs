/**
Output:
Values are2 1
 */
package org.tbs.Class9.Term3.UnitTests;

public class Output1 {

	public static void demo( int a, int b ) {
		int x = a/b;
		int y = a%b;
		System.out.println( "Values are" + x + " " + y );
	}
	
	public static void main( String[] args ) {
		int x=5, y=2;
		demo( x, y );
	}

}
