/**
 * Store 5 names in an array & sort the names in alphabetical order(using bubble sort).
 */
package com.sensei.java.string;

import java.io.*;

public class StringExercise10 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String names[] = new String[5];
		System.out.println( "Enter 5 names:" );
		for ( int x = 0; x < 5; x++ )
			names[x] = br.readLine();
		
		for( int i = 0; i < 5; i++){
			for( int j = 0; j < 4; j++ ){
				if( names[j].compareToIgnoreCase( names[j+1] ) > 0 ){
					
					String buffer = names[j];
					names[j] = names[j+1];
					names[j+1] = buffer;
					
				}				
			}			
		}
		
		System.out.println();
		
		for( int y = 0; y < 5; y++ )
			System.out.println(names[y]);

	}

}
