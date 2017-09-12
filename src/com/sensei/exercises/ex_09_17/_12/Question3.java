package com.sensei.exercises.ex_09_17._12;

import java.io.*;

public class Question3 {

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
				wsi = i+1;
				if( isPalindrome( word ) ) {
					System.out.println( word );
				}
			}
		}
	}
	
	public static boolean isPalindrome( String word ) {
		StringBuffer sb = new StringBuffer( word );
		if( sb.reverse().toString().equals( word ) ) {
			return true;
		}
		return false;
	}
}
