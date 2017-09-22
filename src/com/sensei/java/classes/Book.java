package com.sensei.java.classes;

import java.io.*;

public class Book {
	
	String name,author,publisher;
	double cost;
	int numPages;
	
	public void accept()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter: \n Book's Name \n Author \n Publisher \n Cost \n Pages");
		name = br.readLine();
		author = br.readLine();
		publisher = br.readLine();
		cost = Double.parseDouble(br.readLine());
		numPages = Integer.parseInt(br.readLine());
	}
	
	public void display(){
		System.out.println("Book : " + name );
		System.out.println("Author : " + author );
		System.out.println("Publisher : " + publisher);
		System.out.println("Pages : " + numPages );
		System.out.println("Cost : Rs." + cost );
	}
	
	public void increase(){
		cost+= 50;
		System.out.println("Increased Cost : Rs." + cost );
	}
	
	public static void main(String[] args)throws IOException {
		Book book = new Book();
		book.accept();
		book.display();
		book.increase();
	}

}
