/**
 *Check whether a character entered is a letter(upper/lower case) or a digit or a special character.
 *Then print appropriate messages. 
 */
package com.sensei.java.string;

import java.io.*;

public class StringExercise09 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
		System.out.println( "Enter a character" );
		char c = (char)br.read();
		if ( Character.isLetter(c) == true ){
			
			if( Character.isUpperCase(c) == true )
				System.out.println("It is an upper case letter");
			
			else if( Character.isLowerCase(c) == true )
				System.out.println("It is a lower case letter");
			
		}
		
		else if( Character.isDigit(c) == true )
			System.out.println("It is a digit");
		
		else
			System.out.println("It is special charcter");
		
	}

}
