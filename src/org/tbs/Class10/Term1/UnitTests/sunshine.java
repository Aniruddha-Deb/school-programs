package org.tbs.Class10.Term1.UnitTests;

// part (a) is answered here: name of class is 'sunshine'
public class sunshine {
	
	private int m;
	public sunshine( int k ) {
		m = ++k + --k + ++k + k-- + k;
		
		// for debugging: 
		System.out.println( k );
		// value of k after executing is 4
		
		System.out.println( m );
		// output: 23
	}

	public static void main( String[] args ){
		// value of k before executing is 4
		sunshine obj = new sunshine( 4 );
	}
}
