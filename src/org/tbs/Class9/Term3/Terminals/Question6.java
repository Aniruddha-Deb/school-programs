/**
Objective of the program: 

Accept 10 integers from the console. Find the maximum, minimum and sum of all 
elements in an array.
 */
package org.tbs.Class9.Term3.Terminals;

import java.io.*;

public class Question6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int a[] = new int[10];
		// obtaining the user input
		System.out.println( "Enter the values:" );
		for( int i=0; i<10; i++ ) {
			a[i] = Integer.parseInt( br.readLine() );
		}
		
		int max = a[0];
		int min = a[0];
		int sum = a[0];
		
		for( int i=1; i<10; i++ ) {
			if( a[i] > max ) {
				max = a[i];
			}
			if( a[i] < min ) {
				min = a[i];
			}
			
			sum += a[i];			
		}
		
		System.out.println( "Max = " + max );
		System.out.println( "Min = " + min );
		System.out.println( "Sum = " + sum );
	}
}
