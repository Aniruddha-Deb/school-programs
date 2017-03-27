/**
Objective of the program:

Input a number and check whether it is a disarium number or not. A disarium 
number has the sum of it's digits powered with their respective position equal 
to the number itself
eg. 135 => 1^1 + 3^2 + 5^3 = 135  
 */
package org.tbs.Class9.Term3.Terminals;

import java.io.*;

public class Question5 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.println( "Enter the number: " );
		int n = Integer.parseInt( br.readLine() );
		int numDigits = 0, num = n;
		// obtaining the number of digits in the input number
		while( num > 0 ) {
			num = num / 10;
			numDigits++;
		}
		num = n; // resetting num to the value of n
		
		// obtaining the disarium number in the variable called 'dis'
		int dis=0, d;
		while( num > 0 ) {
			d = num % 10;
			dis += Math.pow( d , numDigits );
			num = num / 10;
			numDigits--;
		}

		if( dis == n ) {
			System.out.println( "Number is a disarium number" );
		}
		else {
			System.out.println( "Number is not a disarium number" );
		}
	}

}
