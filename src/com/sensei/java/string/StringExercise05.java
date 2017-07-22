/**
 * Write a Program to accept full name from the user. Print only the initials 
 * excluding the surname.
 */
package com.sensei.java.string;

import java.io.*;

public class StringExercise05 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String x = br.readLine().trim();
		int len = x.length();
		int y = 0;
		for( int i=0; i<len; i++ ) {
			char c = x.charAt( i );
			if( c == ' ' ) {
				String T = x.substring( y, i );
				System.out.print( T.charAt(0) + "." );
				y = i+1;
			}
		}
		System.out.println( x.substring( y ) );
	}
}
