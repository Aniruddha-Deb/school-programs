package org.tbs.Class10.Term1.UnitTests;

public class Output2 {

	public static void main( String[] args ){
		String s = "Starbucks";
		String y = "Coffee";
		
		// part (a)
		System.out.println( s.concat( y ) );
		// output: StarbucksCoffee
		
		// part (b)
		System.out.println( s.substring( 1, 2 ) + y.substring( 1 ) );
		// output: toffee
		
		// part (c)
		System.out.println( s.compareTo( y ) );
		// output: 16
		
		// part (d)
		System.out.println( s.indexOf( 'k' ) + y.indexOf( 'f' ) );
		// output: 9		
		
	}
}
