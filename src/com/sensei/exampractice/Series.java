package com.sensei.exampractice;

public class Series {
	
	public static double series( double n ) {
		double sum = 0;
		for( int i=1; i<=n; i++ ) {
			double addend = (double)1/i;
			sum += addend;
		}
		return sum;
	}

	public static double series( double a, double n ) {
		double sum = 0;
		for( int i=0,j=2,k=1; i<n; i++,j+=3,k+=3 ) {
			double addend = (double)(k/Math.pow( a, j ));
			sum += addend;
		}
		return sum;
	}
	
	public static void main( String args[] ) {
		System.out.println( series( 2 ) );
		System.out.println( series( 1, 2 ) );
	}
}
