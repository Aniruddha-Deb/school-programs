package com.sensei.exercises.ex_08_17._26;
import java.io.*;

public class ExerciseQ4 {

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
				if( !word.isEmpty() ) {
					System.out.print( 
							Character.toUpperCase( word.charAt( 0 ) ) + "." );
				}
				wordStartIndex = i+1;
			}
		}
	}	
}
