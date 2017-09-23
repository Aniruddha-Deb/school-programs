package com.sensei.java.classes;

import java.io.*;

public class ReserveTicket {
	
	String name;
	double cost;
	
	public void accept()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter your name and cost of ticket : ");
		name = br.readLine();
		cost = Integer.parseInt(br.readLine());
	}
	
	public void display(){
		System.out.println("Buyer Name : " + name + "\nCost of Ticket : Rs." + cost );
	}
	
	public void inrement(){
		System.out.println("Increased Cost of Ticket : Rs." + (cost + 100));
	}
	
	public static void main(String[] args)throws IOException {
		ReserveTicket rt = new ReserveTicket();
		rt.accept();
		rt.display();
		rt.inrement();
	}

}
