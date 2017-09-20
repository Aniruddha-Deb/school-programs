/**
 * WAP that defines a class 'mobike' as follows:
 * Data Members: 
 * 	1. int bno (bike no.)
 * 	2. int phno (phone no. of customer)
 * 	3. String name (name of customer)
 * 	4. int days (no. days the bike is taken on rent
 * 	5. int charge (rent)
 * Member methods:
 * 	1. void input() - input and store details of customer
 * 	2. void compute() - compute rental charge. Rent for a mobike is charged
 * 	on the following basis:
 * 		i)   First 5 days: 500 per day
 * 		ii)  Next 5 days: 400 per day
 * 		iii) remaining days: 200 per day
 * 3. void display() - display the details in the following manner: 
 * Bno.     Phno.     Name      No.days     Charge
 * ----     ----      ----      ------      ------
 * 
 * Write a main method to call above functions
 */
package com.sensei.java.classes;

import java.io.*;

public class mobike {

	int bno, phno, days, charge;
	String name;
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Enter data" );
		bno = Integer.parseInt( br.readLine() );
		phno = Integer.parseInt( br.readLine() );
		name = br.readLine();
		days = Integer.parseInt( br.readLine() );
		charge = Integer.parseInt( br.readLine() );
	}
	
	public void compute() {
		int d = days;
		if( d >= 5 ) {
			charge += 2500;
			d -= 5;
			if( d >= 5 ) {
				charge += 1600;
				d -= 5;
				charge += (200*d);
			}
			else {
				charge += (d*400);
			}			
		}
		else {
			charge += (d*500);
		}
	}
	
	public void display() {
		System.out.println( "Bno\tPhno\tName\tNo.days\tCharge" );
		System.out.println( bno + "\t" + phno + "\t" + name + "\t" + days + "\t" + charge );
	}
	
	public static void main( String[] args ) throws IOException {
		mobike m = new mobike();
		m.input();
		m.compute();
		m.display();
	}
}
