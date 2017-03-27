/**
Output:
1 3 5 7 9 11 13 15 
 */
package org.tbs.Class9.Term3.Terminals;

public class Output3 {

	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		for( int i=0; i<15; i++ ) {
			System.out.print( ar[i++] + " " );
		}
	}
}
