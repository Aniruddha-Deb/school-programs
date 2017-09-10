package com.sensei.exercises.ex_09_17._10;

import java.io.*;

public class Question1 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.println( "Enter an english sentence" );
		String sentence = br.readLine().trim();
		String trimmedSentence = "";
		
		for( int i=0; i<sentence.length(); ) {
			if( sentence.charAt( i ) <= ' ' ) {
				trimmedSentence += ' ';
				i++;
				while( i<sentence.length() && sentence.charAt( i ) <= ' ' ) {
					i++;
				}
			}
			else {
				trimmedSentence += sentence.charAt( i );
				i++;
			}
		}
		
		trimmedSentence += " ";
		
		int wsi = 0;
		String leastNumVowels = "";
		for( int i=0; i<trimmedSentence.length(); i++ ) {
			if( trimmedSentence.charAt( i ) == ' ' ) {
				String word = trimmedSentence.substring( wsi, i );
				if( wsi == 0 ) {
					leastNumVowels = word;
				}
				else if( numVowels( leastNumVowels ) > numVowels( word ) ) {
					leastNumVowels = word;					
				}
				wsi = i+1;
			}
		}
		
		System.out.println( leastNumVowels );
	}
	
	public static int numVowels( String word ) {
		word = word.toUpperCase();
		int numVowels = 0;
		for( int i=0; i<word.length(); i++ ) {
			char c = word.charAt( i );
			if( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
				numVowels++;
			}
		}
		return numVowels;
	}
}
