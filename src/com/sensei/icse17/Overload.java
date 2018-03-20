package com.sensei.icse17;

public class Overload {

	public static void check( String str, char ch ) {
		int freq = 0;
		for( int i=0; i<str.length(); i++ ) {
			char c = str.charAt( i );
			if( c == ch ) {
				freq++;
			}
		}
		System.out.println( "number of " + ch + " present is = " + freq );
	}
	
	public static void check( String s1 ) {
		s1 = s1.toLowerCase();
		for( int i=0; i<s1.length(); i++ ) {
			char c = s1.charAt( i );
			if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
				System.out.print( c + " " );
			}
		}
	}
}
