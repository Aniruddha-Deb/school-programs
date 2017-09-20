/**
 * WAP that defines a class 'Table' as follows:
 * Data Members: l, b and h (in meters)
 * Member methods:
 * 	1. Accept the values
 * 	2. Display the values
 * 	3. Convert metres to centimetres
 * Define main method and design a menu to take user's choice to call 
 * above methods.
 */
package com.sensei.java.classes;

import java.io.*;

public class Table {
	
	public int l, b, h;
	
	public void accept() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Enter length, breadth and height" );
		l = Integer.parseInt( br.readLine() );
		b = Integer.parseInt( br.readLine() );
		h = Integer.parseInt( br.readLine() );
	}
	
	public void display() {
		System.out.println( "Length is " + l );
		System.out.println( "Breadth is " + b );
		System.out.println( "Height is " + h );
	}
	
	public void convert() {
		System.out.println( "Converted units in cm:" );
		System.out.println( "Length is " + l*100 );
		System.out.println( "Breadth is " + b*100 );
		System.out.println( "Height is " + h*100 );
	}
	
	public static void main( String[] args ) throws IOException {
		Table obj = new Table();
		System.out.println( "Enter 1 to accept values" );
		System.out.println( "Enter 2 to display values" );
		System.out.println( "Enter 3 to convert values" );
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int choice = Integer.parseInt( br.readLine() );
		
		if( choice == 1 ) {
			obj.accept();
		}
		else if( choice == 2 ) {
			obj.display();
		}
		else {
			obj.convert();
		}
	}
}
