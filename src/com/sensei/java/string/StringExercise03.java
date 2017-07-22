/**
 * Write a Program to accept a string from the user. convert the string to uppercase 
 * and count and output the number of double letter occurences in the string.
 */

package com.sensei.java.string;

import java.io.*;

public class StringExercise03 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine().toUpperCase();
		int numDL = 0;
		for( int i=0; i<input.length()-1; i++ ) {
			if( input.charAt( i ) == input.charAt( i+1 ) ) {
				numDL++;
			}
		}
		
		System.out.println( numDL );
	}
}
