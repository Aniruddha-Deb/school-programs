package com.sensei.exercises.ex_09_17._10;

import java.io.*;

public class Question2 {

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
		for( int i=0; i<trimmedSentence.length(); i++ ) {
			if( trimmedSentence.charAt( i ) == ' ' ) {
				String word = trimmedSentence.substring( wsi, i );
				if( word.startsWith( "A" ) || word.startsWith( "M" ) ) {
					System.out.println( word );
				}
				wsi = i+1;
			}
		}
	}
}