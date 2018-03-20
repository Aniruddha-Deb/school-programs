package com.sensei.icse17;

import java.util.Scanner;

public class ElectricBill {
	
	String n;
	int units;
	double bill;
	
	void accept() {
		Scanner sc = new Scanner( System.in );
		System.out.println( "Enter name: " );
		n = sc.nextLine();
		System.out.println( "Enter num units consumed:" );
		units = sc.nextInt();
	}
	
	void calculate() {
		if( units <= 100 ) {
			bill = units * 2;
		}
		else if( units > 100 && units <= 300 ) {
			bill = (100*2) + (units-100)*3;
		}
		else {
			bill = 100*2 + 200*3 + (units-300)*5;
			bill += (bill*2.5)/100;
		}
	}
	
	void print() {
		System.out.println( "Name of the customer: " + n );
		System.out.println( "Number of units consumed: " + units );
		System.out.println( "Bill amount: " + bill );
	}

	public static void main( String[] args ){
		ElectricBill bill = new ElectricBill();
		bill.accept();
		bill.calculate();
		bill.print();
	}
}
