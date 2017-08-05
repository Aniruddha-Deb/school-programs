/**
 * To accept a string & print only those characters present at the odd indices
 */
package com.sensei.java.string;

import java.io.*;

public class StringExercise08 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Enter a sentence" );
		String s = br.readLine();
		int  l = s.length();
		
		for( int i = 1; i <= l; i+=2)
			System.out.print( s.charAt(i));
		
	}

}
