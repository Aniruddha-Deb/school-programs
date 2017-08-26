package com.sensei.exercises.ex_08_17._26;
import java.io.*;

public class ExerciseQ1 {

	public static void main( String args[] ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		while( true ) {
			System.out.print( "Enter a string: " );
			String input = br.readLine();
			
			if( isPalindrome( input ) ) {
				System.out.println( "String is a palindrome" );
			}
			else {
				System.out.println( "String is not a palindrome" );
			}
		}
	}	
	
	public static boolean Palin( String str ) {
		String reverse = "";
		for( int i=str.length()-1; i>=0; i-- ) {
			reverse += str.charAt( i );
		}
		
		if( reverse.equals( str ) ) {
			return true;
		}
		return false;
 	}
	
	public static boolean isPalindrome( String str ) {
		
		boolean palin = true;
		for( int i=0,j=str.length()-1; i<str.length()/2; i++,j-- ) {
			if( str.charAt( i ) != str.charAt( j ) ) {
				palin = false;
				break;
			}
		}
		
		return palin;
	}
}
