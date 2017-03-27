package org.tbs.Class9.Term3.Terminals;

import java.io.*;

// S = (1*2)+(2*3)+(3*4)+........n 

public class Question8 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Series : (1*2)+(2*3)+(3*4)+........limit");
		System.out.println();
		System.out.println("Enter the limit for the above series : ");
		int n = Integer.parseInt(br.readLine());		
		sum(n);    
	}
	public static void sum(int limit){
		int prodsum = 0;
		for(int i = 1,j = 2; j<=limit; i++,j++){
			int prod = i*j;
			prodsum = prodsum + prod;		
		}
		System.out.println();
		System.out.println("Sum of the above series = " + prodsum);
		
	}

}
