package org.tbs.Class10.Term1.Terminals;

public class Question3 {
	
	public static void main( String[] args ){
		// subpart 2
		// flowers rose = new flowers();
		
		// subpart 4
		char c = 'a';
		do {
			System.out.println( (int)c );
			c = (char)(c+1);
		}while( c <= 'f' );
		
		// subpart 5
		int p[] = {4, 6, 12, 32, 51};
		p[0] = 25;
		p[3] = p[1];
		int m = p[0] - p[2]; // 13 
		int n = p[3] * 22 * p[1]; // 792 (36*22)
		
		System.out.println( "the difference: " + m );
		System.out.println( " the sum: " + n );
		
		// subpart 7
		boolean p1; boolean q;
		p1 = ("BlueJ".length() > "ABCDE".length()) ? true : false; // false
		q = ("Fun is Computing".startsWith( "Fun" )) ? true : false; // true
		System.out.println( p1 );
		System.out.println( q );
		
		// subpart 8
		String name = "COMPULER";
		// name.setCharAt( 4, 'I' );
		// this will not work because setCharAt is not a string function but is 
		// a stringBuffer function. Hence, a compilation error will be thrown.
		
		// subpart 9
		int b[] = new int[2];
		int a[] = {32, 36, 12, 9, 14};
		b[0] = 64;
		b[1] = a[3];
		int x = a[0] + b[1];
		System.out.println( x ); // output is 41 (32 + 9)
		
		// subpart 10
		int[] y = {0, 1, 2, 3, 4};
	}

}
