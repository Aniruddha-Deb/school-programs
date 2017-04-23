package com.ethan.java.constructors;

public class Box {

	double length;
	double height;
	double width;
	
	Box(){
		length = 0;
		height = 0;
		width = 0;
	}
	
	Box( double length, double width, double height){
		this.length =length;
		this.width = width;
		this.height= height;
	}
	
	public static void main(String[] args){
		Box dimensions = new Box( 3.89, 2.1, 1.5);
		double vol = dimensions.length * dimensions.height * dimensions.width;
		System.out.println("Volume of Box = " + vol);
	}

}	