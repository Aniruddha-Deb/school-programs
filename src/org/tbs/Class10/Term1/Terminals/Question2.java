package org.tbs.Class10.Term1.Terminals;

public class Question2 {
	
	public static void main( String args[] ) {
		// subpart 2:
		String s1 = "Chelsea", s2 = "Liverpool";
		System.out.println( s1.compareTo( s2 ) ); // int, -9
		System.out.println( s1.equals(s2) ); // boolean, false
		
		// subpart 3:
		String wrd = "word";
		char c = wrd.charAt( wrd.length()-2 ); // 'r'
		boolean b = Character.isUpperCase( wrd.charAt( 1 ) ); // false
	}
}
