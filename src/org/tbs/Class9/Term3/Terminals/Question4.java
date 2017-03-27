/**
Objective of the program: 

Design a class to overload a function polygon() as follows: 
i. void polygon( int x, int y ) - with two integer arguments that draws a filled 
   rectangle of length x and breadth y, using symbol @
ii.void polygon() - with no argument that draws a filled triangle as shown below: 
   1
   10
   101
   1010 
 */

package org.tbs.Class9.Term3.Terminals;

public class Question4 {
	
	public static void polygon( int x, int y ) {
		// We use a nested for loop to print the rectangle. 'i' controls the 
		// rows whereas 'j' controls the columns
		for( int i=0; i<x; i++ ) {
			for( int j=0; j<y; j++ ) {
				System.out.print( "@" );
			}
			System.out.println();
		}
	}
	
	public static void polygon() {
		// again using a nested for loop
		for( int i=0; i<4; i++ ) {
			for( int j=0; j<=i; j++ ) {
				
				// if the value of 'j' is even, we print 1, else print 0
				if( j%2 == 0 ) {
					System.out.print( "1" );
				}
				else {
					System.out.print( "0" );
				}
			}
			System.out.println();
		}
	}
	
	// Main method is not supposed to be written but has been written in this 
	// program for the sake of testing
	public static void main(String[] args) {
		polygon( 2, 5 );
		polygon();
	}

}
