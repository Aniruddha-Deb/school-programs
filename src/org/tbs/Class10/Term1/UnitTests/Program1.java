package org.tbs.Class10.Term1.UnitTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
	
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int a[] = new int[15];
		for( int i=0; i<15; i++ ) {
			a[i] = Integer.parseInt( br.readLine() );
		}
		
		for( int i=0; i<15; i++ ) {
			int index = i;
			for( int j=i+1; j<15; j++ ) {
				if( a[index] > a[j] ) {
					index = j;
				}
			}
			
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
		
		for( int i=0; i<15; i++ ) {
			System.out.println( a[i] );
		}
	}

}
