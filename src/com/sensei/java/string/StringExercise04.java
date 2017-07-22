/**
 * Write a Program to store five words in a 1D array. Assume words are in lowercase. 
 * Print only those words which begin and end with a vowel.
 */
package com.sensei.java.string;

import java.io.*;

public class StringExercise04 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
		String a[] = new String[5];
		for( int i=0; i<5; i++ ) {
			a[i] = br.readLine().toLowerCase();
		}
		
		for( int i=0; i<5; i++ ) {
			char fc = a[i].charAt( 0 );
			char lc = a[i].charAt( a[i].length()-1 );
			if( isVowel( fc ) && isVowel( lc ) ) {
				System.out.println( a[i] );
			}
		}
	}
	
	public static boolean isVowel( char c ) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
