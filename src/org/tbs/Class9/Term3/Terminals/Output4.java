/**
Output:
3
5
7
9
11
 */
package org.tbs.Class9.Term3.Terminals;

public class Output4 {
	
	public static void main(String[] args) {
		int t[] = new int[5];
		for( int i=0, j=3; i<5; i++, j++ ) {
			t[i] = i+j;
			System.out.println( t[i] );
		}
	}

}
