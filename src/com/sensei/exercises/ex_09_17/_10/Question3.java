package com.sensei.exercises.ex_09_17._10;

import java.io.*;

public class Question3 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.println( "Enter a string" );
		String str = br.readLine().trim().toUpperCase();
		int[] frequency = new int[26];
		
		for( int i=0; i<str.length(); i++ ) {
			char c = str.charAt( i );
			if( (int)c >= 'A' ) {
				frequency[(int)c-'A']++;
			}			
		}
		
		System.out.println( "CHARACTERS FREQUENCY" );
		
		for( int i=0; i<26; i++ ) {
			if( frequency[i] != 0 ) {
				System.out.println( (char)(i+'A') + "   " + frequency[i] );
			}
		}
	}
}
