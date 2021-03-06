package com.sensei.exercises.ex_08_17._26;
import java.io.*;

public class ExerciseQ2 {

	public static void main( String args[] ) throws IOException {
		
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
		
		int wordStartIndex = 0;
		for( int i=0; i<trimmedSentence.length(); i++ ) {
			if( trimmedSentence.charAt( i ) == ' ' ) {
				String word = trimmedSentence.substring( wordStartIndex, i );
				if( isVowel( word.charAt( 0 ) ) ) {
					System.out.println( word );
				}
				wordStartIndex = i+1;
			}
		}
	}	
	
	public static boolean isVowel( char in ) {
		char c = Character.toLowerCase( in );
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
