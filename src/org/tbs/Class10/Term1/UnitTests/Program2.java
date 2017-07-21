package org.tbs.Class10.Term1.UnitTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int input[] = new int[50];
		for( int i=0; i<50; i++ ) {
			input[i] = Integer.parseInt( br.readLine() );
		}
		
		int search = Integer.parseInt( br.readLine() );
		int position = -1;
		for( int i=0; i<50; i++ ) {
			if( input[i] == search ) {
				position = i+1;
			}
		}
		
		if( position == -1 ) {
			System.out.println( "Search element not found" );
		}
		else {
			System.out.println( "Position is " + position );
		}
	}

}
