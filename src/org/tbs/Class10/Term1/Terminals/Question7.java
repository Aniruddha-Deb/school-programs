package org.tbs.Class10.Term1.Terminals;

import java.io.*;

public class Question7 {
	
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		input = input.trim() + " ";
		String reverse = "";
		int y = 0;
		for( int i=0; i<input.length(); i++ ) {
			if( input.charAt( i ) == ' ' ) {
				String word = input.substring( y, i );
				for( int j=word.length()-1; j>=0; j-- ) {
					reverse += word.charAt( j );
				}
				reverse += ' ';
				y = i+1;
			}
		}
		
		System.out.println( reverse );
		
	}

}
