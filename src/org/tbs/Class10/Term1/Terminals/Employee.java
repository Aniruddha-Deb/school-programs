package org.tbs.Class10.Term1.Terminals;

public class Employee {
	
	public int code;
	public String name;
	public int basic;
	public double hra;
	public double da;
	public double PF;
	
	public Employee() {
		basic = 0;
		hra = 0;
		da = 0;
		PF = 0;
	}
	
	public Employee( int b ) {
		basic = b;
		hra = (10*basic)/100;
		da = (55*basic)/100;
		PF = 1000;
	}

	public static void main( String[] args ){
		Employee obj = new Employee( 20000 );
		double netsalary = (obj.basic + obj.da + obj.hra) - obj.PF;
		System.out.println( "Net salary is " + netsalary );
	}
}
