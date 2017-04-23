package com.ethan.java.constructors;

public class Salesman {
	
	double sales;
	double commission;
		
	Salesman(){
		sales = 0;
		commission = 0;
		
	}
	
	Salesman( double sales, double commission){
		this.sales = sales;
		this.commission = commission;
	}
	
	public static void main(String[] args){
		Salesman com = new Salesman( 15000, 2);
		double  comm = (com.commission/100) * com.sales;
		System.out.println("The monthly commission of the salesman is  " + comm + " Rupees");
	}


}
