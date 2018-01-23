package com.sensei.exampractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	
	int pan;
	String name;
	double taxableIncome;
	double tax;
	
	void input() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Enter pan number, name, taxable income:" );
		pan = Integer.parseInt( br.readLine() );
		name = br.readLine();
		taxableIncome = Double.parseDouble( br.readLine() );
	}
	
	void calc() {
		if( taxableIncome <= 100000 ) {
			tax = 0;
		}
		else if( taxableIncome > 100000 && taxableIncome <= 150000 ) {
			tax = (10*(taxableIncome-100000))/100.0;
		}
		else if( taxableIncome > 150000 && taxableIncome <= 250000 ) {
			tax = 5000 + (20*(taxableIncome-150000))/100.0;
		}
		else if( taxableIncome > 250000 ) {
			tax = 25000 + (30*(taxableIncome-250000))/100.0;
		}
	}
	
	void display() {
		System.out.println( "Employee name: " + name );
		System.out.println( "Employee pan: " + pan );
		System.out.println( "Employee taxable income: " + taxableIncome );
		System.out.println( "Employee tax: " + tax );
	}
	
	public static void main( String[] args ) throws IOException {
		Employee e = new Employee();
		e.input();
		e.calc();
		e.display();
	}
}
