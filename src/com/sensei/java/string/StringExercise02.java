/**
 * Write a Program to accept a line of text from the user and count the number of
 * times each vowel appears in the text.
 */

package com.sensei.java.string;

import java.io.*;

public class StringExercise02 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine().toLowerCase();
		String vowels = "aeiou";
		int[] numOccurences = new int[5];
		
		for( int i=0; i<input.length(); i++ ) {
			int index = vowels.indexOf( input.charAt( i ) );
			if( index != -1 ) {
				numOccurences[index]++;
			}
		}
		
		for( int i=0; i<vowels.length(); i++ ) {
			System.out.println( vowels.charAt( i ) + " = " + numOccurences[i] );
		}
	}
}
