package org.tbs.Class10.Term1.Terminals;

public class Question6 {

	public static void main( String[] args ){
		// initializing data
		int[] data = {2, 5, 4, 1, 3};
		
		// initializing counters
		int min = data[0];
		int max = data[0];
		int sum = data[0];
		
		for( int i=1; i<5; i++ ) {
			if( data[i] > max ) max = data[i];
			if( data[i] < min ) min = data[i];
			sum += data[i];
		}
		
		System.out.println( "Minimum value: " + min );
		System.out.println( "Maximum value: " + max );
		System.out.println( "Sum of the elements: " + sum );
	}
}
