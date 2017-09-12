package com.sensei.exercises.ex_09_17._12;

import java.io.*;

public class Question2 {

	public static void main( String[] args ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.println( "Enter 50 names" );
		int numNames = 0;
		for( int i=0; i<5; i++ ) {
			String name = br.readLine();
			for( int j=0; j<name.length()-1; j++ ) {
				if( name.charAt( j ) == (name.charAt( j+1 )-1) ) {
					numNames++;
					break;
				}
			}
		}

		System.out.println( numNames );
	}
}