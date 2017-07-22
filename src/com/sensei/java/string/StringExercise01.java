/**
 * Write a Program to accept a string from the user and check whether it is a 
 * palindrome string or not without using reverse function.
 */

package com.sensei.java.string;

import java.io.*;

public class StringExercise01 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
		System.out.println( "Enter a string" );
		String a = br.readLine();
		String r = "";
		for( int i=a.length()-1; i>=0; i-- ) {
			r += a.charAt( i );
		}
		
		if( a.equals( r ) ) {
			System.out.println( "Palindrome" );
		}
		else {
			System.out.println( "Not a Palindrome" );
		}
	}
}
