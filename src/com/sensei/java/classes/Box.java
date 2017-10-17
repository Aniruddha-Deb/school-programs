package com.sensei.java.classes;

import java.io.*;

public class Box {

	int l,b,h;
	
	public void accept()throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter length, breadth and height : ");
		l = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		h = Integer.parseInt(br.readLine());
	}
	
	public void volume(){
		System.out.println("Volume = " + ( l * b * h ));
	}
	
	public void TSA(){
		System.out.println("Total Surface Area = " + ( 2*(l*b + b*h + h*l)));
	}
	
	public static void main(String[] args)throws IOException {
		Box box = new Box();
		box.accept();
		box.volume();
		box.TSA();
	}

}
