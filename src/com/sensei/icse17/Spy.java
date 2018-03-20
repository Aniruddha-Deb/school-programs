package com.sensei.icse17;

import java.util.Scanner;

public class Spy {

	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		System.out.println( "Enter a number" );
		int n = sc.nextInt();
		int sum=0, prod=1, d;
		
		while( n > 0 ) {
			d = n%10;
			sum += d;
			prod *= d;
			n = n/10;
		}
		
		if( sum == prod ) {
			System.out.println( "Spy number" );
		}
		else {
			System.out.println( "Not a spy number" );
		}
	}
}
