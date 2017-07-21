package org.tbs.Class10.Term1.UnitTests;

public class factorial {

	int a;
	
	public factorial() {
		a=0;
	}
	
	public factorial( int m ) {
		a=m;
		int fact = 1;
		for( int i=1; i<=m; i++ ) {
			fact *= i;
		}
		System.out.println( fact );
	}
	
	public static void main( String[] args ){
		factorial obj = new factorial();
		// no output
		factorial obj1 = new factorial(4);
		// output = 24
	}
}
