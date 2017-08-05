/**
 * Write a Program to accept a sentence from the user and print only initials in 
 * uppercase with a full stop.
 */

package com.sensei.java.string;

import java.io.*;

public class StringExercise06 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.print( "enter a sentence" );
		String x = br.readLine().trim().toUpperCase();
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
		System.out.println( x.charAt(y) );
	}
}
