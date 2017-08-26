package com.sensei.java.string;
import java.io.*;

public class StringExercise07 {

	public static void main(String[] args)throws IOException {		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in ) );
		System.out.println( "Enter a sentence" );
		String s = br.readLine();
		s = s + " ";
		int l = s.length();
		int i, j = 0, k = 0;
		String str;
		int len[] = new int[l];
		
		for( i = 0; i <= l-1; i++ ){			
			char c = s.charAt(i);			
			if( c == ' '){				
				str = s.substring( j, i );
				len[k] = str.length();
				k++;
				j = i + 1;							
			}			
		}
		
		int max = 0;		
		for( int x = 0; x <= k; x++ ){			
			if( len[x] > max )
				max = len[x];						
		}
		
		System.out.println( "Length of longest word = " + max );		
	}
}
