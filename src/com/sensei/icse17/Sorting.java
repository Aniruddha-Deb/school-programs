package com.sensei.icse17;

import java.util.Scanner;

public class Sorting {

	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		System.out.println( "Enter 40 words" );
		String[] words = new String[40];
		for( int i=0; i<40; i++ ) {
			words[i] = sc.nextLine();
		}
		
		for( int i=0; i<40; i++ ) {
			int pos=i;
			for( int j=i+1; j<40; j++ ) {
				if( words[pos].compareTo( words[j] ) < 0 ) {
					pos=j;
				}
			}
			String temp = words[i];
			words[i] = words[pos];
			words[pos] = temp;
		}
		
		for( int i=0; i<40; i++ ) {
			System.out.println( words[i] );
		}
	}
}
