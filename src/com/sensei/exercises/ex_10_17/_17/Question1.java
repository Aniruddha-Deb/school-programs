package com.sensei.exercises.ex_10_17._17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {

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
		String w = null;
		for( int i=0; i<trimmedSentence.length(); i++ ) {
			if( trimmedSentence.charAt( i ) == ' ' ) {
				String word = trimmedSentence.substring( wordStartIndex, i );
				int wl = word.length();
				int numVowels = getNumVowels( word );
				if( w == null ) {
					w = word; 
				}
				else if( wl > w.length() || numVowels < getNumVowels( w ) ) {
					w = word;
				}
				wordStartIndex = i+1;
			}
		}
		
		System.out.println( w );
	}	
	
	public static int getNumVowels( String s ) {
		int nv = 0;
		for ( char ch : s.toCharArray() ) {
			char c = Character.toLowerCase( ch );
			if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				nv++;
			};
		}
		return nv;
	}

}
