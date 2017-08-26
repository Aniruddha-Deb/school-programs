package com.sensei.exercises.ex_08_17._26;
import java.io.*;

public class ExerciseQ3 {

	public static void main( String args[] ) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.print( "Enter a word: " );
		String in = br.readLine().trim();

		for( int i=0; i<in.length(); i++ ) {
			int k = in.length()-1-i;
			for( int j=0; j<=i; j++ ) {				
				System.out.print( in.charAt( k ) );
				k++;
			}
			System.out.println();
		}
	}
}
