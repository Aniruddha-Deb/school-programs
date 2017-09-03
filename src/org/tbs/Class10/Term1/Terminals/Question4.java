package org.tbs.Class10.Term1.Terminals;

import java.io.*;

public class Question4 {
	
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		String inverse = "";
		for( int i=0; i<input.length(); i++ ) {
			char c = input.charAt( i );
			if( Character.isLetter( c ) ) {
				if( Character.isUpperCase( c ) ) {
					inverse += Character.toLowerCase( c );
				}
				else {
					inverse += Character.toUpperCase( c );					
				}
			}
			else {
				inverse += c;
			}
		}
		
		System.out.println( inverse );
	}
}
