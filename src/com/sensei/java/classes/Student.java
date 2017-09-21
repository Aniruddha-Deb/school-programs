/**
 * WAP that defines a class 'Student' as follows:
 * Data Members: age, name, m1, m2, m3, max, avg 
 * Member methods:
 * 	1. parameterized constructor to initialize data members
 * 	2. Accept details of student
 * 	3. compute avg. & max of 3 marks
 * 	4. display name, age, marks in 3 subjects, max and average
 * 
 * Write a main method to create an object of a class and call above member 
 * methods
 */
package com.sensei.java.classes;

import java.io.*;

public class Student {

	int age;
	String name;
	double m1, m2, m3;
	double max, avg;
	
	public Student( String n, int a, double x, double y, double z ) {
		name = n;
		age = a;
		m1 = x;
		m2 = y;
		m3 = z;		
	}
	
	public void accept() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Enter name, age and marks" );
		name = br.readLine();
		age = Integer.parseInt( br.readLine() );
		m1 = Double.parseDouble( br.readLine() );
		m2 = Double.parseDouble( br.readLine() );
		m3 = Double.parseDouble( br.readLine() );
	}
	
	public void compute() {
		if( m1 > m2 && m1 > m3 ) {
			max = m1;
		}
		else if( m2 > m1 && m2 > m3 ) {
			max = m2;
		}
		else {
			max = m3;
		}
		
		avg = (m1+m2+m3)/3;
	}
	
	public void display() {
		System.out.println( "Name = " + name );
		System.out.println( "Age = " + age );
		System.out.println( "m1 = " + m1 );
		System.out.println( "m2 = " + m2 );
		System.out.println( "m3 = " + m3 );
		System.out.println( "max = " + max );
		System.out.println( "avg = " + avg );	
	}

	public static void main( String[] args ) throws IOException {
		// dummy values
		Student obj = new Student( "", 0, 0, 0, 0 );
		
		obj.accept();
		obj.compute();
		obj.display();
	}
}
