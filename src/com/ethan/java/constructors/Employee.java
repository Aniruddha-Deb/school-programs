package com.ethan.java.constructors;

import java.io.*;

public class Employee {
	
	double basic;
	double HRA;
	double DA;
	double PF;
	int ecode;
	
	Employee(){
		basic = 0;
		HRA = 0;
		DA = 0;
		PF = 0;
		ecode = 0;
	}
	
	Employee( double basic, int ecode){
		this.basic = basic;
		this.ecode = ecode;
	}
	
	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader( isr );
		
		System.out.println("Enter employee name : ");
		String name = br.readLine();
		System.out.println("Enter employee code : ");
		int ecode = Integer.parseInt(br.readLine());
		System.out.println("Enter basic salary of the employee : ");
		double basic = Double.parseDouble(br.readLine());
		
		Employee pay = new Employee( basic, ecode);
	
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Code : " + pay.ecode);
		System.out.println("Basic Salary : " + pay.basic);
		System.out.println("HRA : " + pay.HRA);
		System.out.println("DA : " + pay.DA);
		System.out.println("PF : " + pay.PF);
		System.out.println("Net Salary : " + ( pay.basic + pay.HRA + pay.DA - (pay.PF)) );
		
	}

}
