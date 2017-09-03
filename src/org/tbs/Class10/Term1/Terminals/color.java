package org.tbs.Class10.Term1.Terminals;

public class color {

	public String ColTop;
	public String ColBottom;
	
	public color() {
		ColTop = "Pink";
		ColBottom = "Black";
	}
	
	public color( String top, String bottom ) {
		ColTop = top;
		ColBottom = bottom;
	}
	
	public static void main( String[] args ){
		color obj1 = new color();
		System.out.println( obj1.ColTop );
		System.out.println( obj1.ColBottom );
		
		color obj2 = new color( "Yellow", "Brown" );
		System.out.println( obj2.ColTop );
		System.out.println( obj2.ColBottom );
	}
}
