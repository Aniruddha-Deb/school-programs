package com.sensei.icse17;

import java.util.Scanner;

public class MenuDriven {

	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		System.out.println( "Enter 1 to find the sum of the first series" );
		System.out.println( "Enter 2 to print the pattern" );
		int opt = sc.nextInt();
		switch( opt ) {
			case 1:
				int sign = 1, sum=0;
				for( int i=1; i<=20; i++ ) {
					sum = (int)( sum + sign*Math.pow( 2, i ) );
					sign *= -1;
				}
				System.out.println( sum );
			break;
			
			case 2:
				for( int i=0; i<5; i++ ) {
					for( int j=0; j<5; j++ ) {
						if( j <= i ) {
							System.out.print( "1" );
						}
						else {
							System.out.print( " " );
						}
					}
				}
			break;
			
			default:
				System.out.println( "Error!" );
		}
	}
}
