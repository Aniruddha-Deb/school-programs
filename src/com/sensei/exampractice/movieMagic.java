package com.sensei.exampractice;

import java.util.Scanner;

public class movieMagic {

	int year;
	String title;
	float rating;
	
	movieMagic() {
		year = 0;
		title = "";
		rating = 0;
	}
	
	void accept() {
		System.out.println( "Enter movie year, title and rating:" );
		Scanner sc = new Scanner( System.in );
		year = sc.nextInt();
		sc.nextLine();
		title = sc.nextLine();
		rating = sc.nextFloat();
	}
	
	void display() {
		System.out.println( "Title of the movie: " + title );
		String feedback = "";
		if( rating >= 0 && rating <= 2 ) {
			feedback = "Flop";
		}
		else if( rating > 2 && rating <= 3.4 ) {
			feedback = "Semi-hit";
		}
		else if( rating > 3.4 && rating <= 4.5 ) {
			feedback = "Hit";
		}
		else if( rating > 4.5 && rating <= 5 ) {
			feedback = "Super Hit";
		}
		System.out.println( "Feedback: " + feedback );
	}
	
	public static void main( String[] args ){
		movieMagic m = new movieMagic();
		m.accept();
		m.display();
	}
}
