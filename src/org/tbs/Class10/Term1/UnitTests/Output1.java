package org.tbs.Class10.Term1.UnitTests;

public class Output1 {
	
	public static void main( String[] args ){
		String s = "Evergreen";
		
		// part (a)
		System.out.println( s.substring( 4 ) );
		// output: green
		
		// part (b)
		System.out.println( s.charAt( s.indexOf( 'r' ) ) );
		// output: r
		
		// part (c)
		System.out.println( s.toLowerCase() );
		// original was System.out.println( s.toLowerCase( s.charAt( 4 ) );
		// but that throws an error, hence has been ignored.
		// output: evergreen
	}

}
