package com.sensei.icse17;

import java.util.Scanner;

public class Array {

	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int a[] = new int[20];
		System.out.println( "Enter 20 elements" );
		for( int i=0; i<20; i++ ) {
			a[i] = sc.nextInt();
		}
		
		int largest = a[0], smallest=a[0], sum=a[0];
		for( int i=1; i<20; i++ ) {
			if( a[i] > largest ) {
				largest = a[i];
			}
			if( a[i] < smallest ) {
				smallest = a[i];
			}
			sum += a[i];
		}
		
		System.out.println( "Largest no. = " + largest );
		System.out.println( "Smallest no. = " + smallest );
		System.out.println( "Sum = " + sum );
		
	}
}
